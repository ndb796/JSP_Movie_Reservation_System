package reservation.command.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import reservation.dao.UserDAO;
import reservation.dto.UserDTO;
import reservation.frontController.ActionForward;
import reservation.util.ModalUtil;
import reservatoin.command.Command;

public class UserListViewCommand implements Command {

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		boolean isRedirect = false;
		String viewPage = "userListView.jsp";
		HttpSession session = request.getSession();
		String userID = null;
		if(session.getAttribute("userID") != null) {
			userID = (String) session.getAttribute("userID");
		}
		if(userID == null) {
			session.setAttribute("modal", new ModalUtil("오류 메시지", "로그인을 먼저 해주세요.", ModalUtil.ERROR));
			viewPage = "userLoginView.reservation";
			isRedirect = true;
		} else {
			UserDAO userDAO = new UserDAO();
			UserDTO user = userDAO.getUser(userID);
			if(user.getUserType() != 0) {
				session.setAttribute("modal", new ModalUtil("오류 메시지", "관리자가 아닙니다.", ModalUtil.ERROR));
				viewPage = "userMainView.reservation";
				isRedirect = true;
			}
			request.setAttribute("userList", userDAO.getUserList());
		}
		return new ActionForward(isRedirect, viewPage);
	}
	
}
