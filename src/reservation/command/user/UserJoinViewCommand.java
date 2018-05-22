package reservation.command.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import reservation.dao.UserDAO;
import reservation.frontController.ActionForward;
import reservation.util.ModalUtil;
import reservatoin.command.Command;

public class UserJoinViewCommand implements Command {

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		boolean isRedirect = true;
		String viewPage = "userJoinView.reservation";
		HttpSession session = request.getSession();
		String userName = null;
		String userResidentID = null;
		if(session.getAttribute("userNameForJoin") != null) {
			userName = (String) session.getAttribute("userNameForJoin");
		}
		if(request.getParameter("userResidentIDForJoin") != null) {
			userResidentID = (String) session.getAttribute("userResidentIDForJoin");
		}
		if(userName == null || userResidentID == null ||
		   userName.equals("") || userResidentID.equals("")) {
			session.setAttribute("modal", new ModalUtil("오류 메시지", "실명 및 주민등록번호 인증을 먼저 해주세요.", ModalUtil.ERROR));
		} else {
			viewPage = "userJoinView.reservation";
		}
		return new ActionForward(isRedirect, viewPage);
	}
	
}
