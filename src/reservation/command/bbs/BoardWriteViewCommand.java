package reservation.command.bbs;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import reservation.dao.BbsDAO;
import reservation.dto.BbsDTO;
import reservation.frontController.ActionForward;
import reservation.util.ModalUtil;
import reservatoin.command.Command;

public class BoardWriteViewCommand implements Command {

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		boolean isRedirect = false;
		String viewPage = "boardWriteView.jsp";
		HttpSession session = request.getSession();
		String userID = null;
		if(session.getAttribute("userID") != null) {
			userID = (String) session.getAttribute("userID");
		}
		if(userID == null) {
			session.setAttribute("modal", new ModalUtil("오류 메시지", "로그인을 먼저 해주세요.", ModalUtil.ERROR));
			viewPage = "userLoginView.reservation";
			isRedirect = true;
		}
		return new ActionForward(isRedirect, viewPage);
	}
	
}
