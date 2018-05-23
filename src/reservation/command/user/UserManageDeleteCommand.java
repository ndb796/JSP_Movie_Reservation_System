package reservation.command.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import reservation.dao.UserDAO;
import reservation.dto.UserDTO;
import reservation.frontController.ActionForward;
import reservation.util.ModalUtil;
import reservatoin.command.Command;

public class UserManageDeleteCommand implements Command {

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		boolean isRedirect = true;
		String viewPage = "mainView.reservation";
		HttpSession session = request.getSession();
		String userID = null;
		if(session.getAttribute("userID") != null) {
			userID = (String) session.getAttribute("userID");
		}
		if(userID == null || userID.equals("")) {
			session.setAttribute("modal", new ModalUtil("오류 메시지", "세션이 만료되었습니다.", ModalUtil.ERROR));
		} else {
			UserDAO userDAO = new UserDAO();
			UserDTO user = userDAO.getUser(userID);
			if(user.getUserType() != 0) {
				session.setAttribute("modal", new ModalUtil("오류 메시지", "관리자가 아닙니다.", ModalUtil.ERROR));
				viewPage = "userMainView.reservation";
				isRedirect = true;
			} else {
				int result = userDAO.delete(userID);
				if (result == 1) {
					session.setAttribute("modal", new ModalUtil("오류 메시지", "회원탈퇴에 실패했습니다.", ModalUtil.ERROR));
				} else {
					session.removeAttribute("userID");
					session.removeAttribute("userType");
					session.setAttribute("modal", new ModalUtil("성공 메시지", "회원탈퇴에 성공했습니다.", ModalUtil.SUCCESS));
					viewPage = "mainView.reservation";
				}
			}
		}
		return new ActionForward(isRedirect, viewPage);
	}
	
}
