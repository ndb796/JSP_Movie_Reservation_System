package reservation.command.bbs;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import reservation.dao.BbsDAO;
import reservation.dto.BbsDTO;
import reservation.frontController.ActionForward;
import reservation.util.ModalUtil;
import reservatoin.command.Command;

public class BoardDeleteActionCommand implements Command {

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		boolean isRedirect = true;
		String viewPage = "boardListView.reservation";
		HttpSession session = request.getSession();
		String userID = null;
		if(session.getAttribute("userID") != null) {
			userID = (String) session.getAttribute("userID");
		}
		if(userID == null) {
			session.setAttribute("modal", new ModalUtil("오류 메시지", "로그인을 먼저 해주세요.", ModalUtil.ERROR));
			viewPage = "userLoginView.reservation";
		} else {
			int bbsID = 0;
			if (request.getParameter("bbsID") != null) {
				bbsID = Integer.parseInt(request.getParameter("bbsID"));
			}
			if(bbsID == 0) {
				session.setAttribute("modal", new ModalUtil("오류 메시지", "유효하지 않은 글입니다.", ModalUtil.ERROR));
				viewPage = "mainView.reservation";
				isRedirect = true;
			}
			BbsDTO bbs = new BbsDAO().getBbs(bbsID);
			if (bbs.getBbsAvailable() == 0) {
				session.setAttribute("modal", new ModalUtil("오류 메시지", "삭제된 글입니다.", ModalUtil.ERROR));
				viewPage = "mainView.reservation";
				isRedirect = true;
			}
			if (!userID.equals(bbs.getUserID())) {
				session.setAttribute("modal", new ModalUtil("오류 메시지", "권한이 없습니다.", ModalUtil.ERROR));
				viewPage = "mainView.reservation";
				isRedirect = true;
			} else {
				BbsDAO bbsDAO = new BbsDAO();
				int result = bbsDAO.delete(bbsID);
				if (result == -1) {
					session.setAttribute("modal", new ModalUtil("오류 메시지", "오류가 발생했습니다.", ModalUtil.ERROR));
				} else {
					session.setAttribute("modal", new ModalUtil("성공 메시지", "성공적으로 삭제되었습니다.", ModalUtil.SUCCESS));
				}
			}
		}
		
		return new ActionForward(isRedirect, viewPage);
	}
	
}

