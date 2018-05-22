package reservation.command.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import reservation.dao.UserDAO;
import reservation.frontController.ActionForward;
import reservation.util.ModalUtil;
import reservatoin.command.Command;

public class UserJoinCommand implements Command {

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		boolean isRedirect = true;
		String viewPage = "userJoinView.reservation";
		HttpSession session = request.getSession();
		String userID = null;
		String userPassword = null;
		if(request.getParameter("userID") != null) {
			userID = request.getParameter("userID");
		}
		if(request.getParameter("userPassword") != null) {
			userPassword = request.getParameter("userPassword");
		}
		if(userID == null || userPassword == null ||
		   userID.equals("") || userPassword.equals("")) {
			session.setAttribute("modal", new ModalUtil("오류 메시지", "모든 내용은 빈 칸일 수 없습니다.", ModalUtil.ERROR));
		} else {
			UserDAO userDAO = new UserDAO();
			int result = userDAO.login(userID, userPassword);
			if (result == 0) {
				session.setAttribute("modal", new ModalUtil("오류 메시지", "비밀번호가 틀립니다.", ModalUtil.ERROR));
			} else if(result == -1) {
				session.setAttribute("modal", new ModalUtil("오류 메시지", "아이디가 없습니다.", ModalUtil.ERROR));
			} else if(result == -2) {
				session.setAttribute("modal", new ModalUtil("오류 메시지", "데이터베이스 오류가 발생했습니다.", ModalUtil.ERROR));
			} else if(result == 1) {
				session.setAttribute("userID", userID);
				session.setAttribute("modal", new ModalUtil("성공 메시지", "로그인에 성공했습니다.", ModalUtil.SUCCESS));
				viewPage = "mainView.reservation";
			}
		}
		return new ActionForward(isRedirect, viewPage);
	}
	
}
