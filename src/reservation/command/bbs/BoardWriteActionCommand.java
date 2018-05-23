package reservation.command.bbs;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import reservation.dao.BbsDAO;
import reservation.frontController.ActionForward;
import reservation.util.ModalUtil;
import reservatoin.command.Command;

public class BoardWriteActionCommand implements Command {

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		boolean isRedirect = true;
		String viewPage = "boardListView.reservation";
		HttpSession session = request.getSession();
		
		String userID = null;
		String bbsTitle = null;
		String bbsContent = null;
		if(session.getAttribute("userID") != null) {
			userID = (String) session.getAttribute("userID");
		}
		if(request.getParameter("bbsTitle") != null) {
			bbsTitle = (String) request.getParameter("bbsTitle");
		}
		if(request.getParameter("bbsContent") != null) {
			bbsContent = (String) request.getParameter("bbsContent");
		}
		if(userID == null) {
			session.setAttribute("modal", new ModalUtil("오류 메시지", "로그인을 먼저 해주세요.", ModalUtil.ERROR));
			viewPage = "userLoginView.reservation";
		} else {
			if (bbsTitle == null || bbsContent == null) {
				session.setAttribute("modal", new ModalUtil("오류 메시지", "입력이 안 된 사항이 있습니다.", ModalUtil.ERROR));
				viewPage = "boardWriteView.reservation";
			} else {
				BbsDAO bbsDAO = new BbsDAO();
				int result = bbsDAO.write(bbsTitle, userID, bbsContent);
				if (result == -1) {
					session.setAttribute("modal", new ModalUtil("오류 메시지", "오류가 발생했습니다.", ModalUtil.ERROR));
					viewPage = "boardWriteView.reservation";
				} else {
					session.setAttribute("modal", new ModalUtil("성공 메시지", "성공적으로 작성했습니다.", ModalUtil.SUCCESS));
				}
			}
		}
		
		return new ActionForward(isRedirect, viewPage);
	}
	
}
