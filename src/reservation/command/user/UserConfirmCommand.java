package reservation.command.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import reservation.frontController.ActionForward;
import reservation.util.ModalUtil;
import reservatoin.command.Command;

public class UserConfirmCommand implements Command {

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		boolean isRedirect = true;
		String viewPage = "userConfirmView.reservation";
		HttpSession session = request.getSession();
		String userName = null;
		String userResidentID = null;
		if(request.getParameter("userName") != null) {
			userName = request.getParameter("userName");
		}
		if(request.getParameter("userResidentID") != null) {
			userResidentID = request.getParameter("userResidentID");
		}
		if(userName == null || userResidentID == null ||
				userName.equals("") || userResidentID.equals("")) {
			session.setAttribute("modal", new ModalUtil("오류 메시지", "모든 내용은 빈 칸일 수 없습니다.", ModalUtil.ERROR));
		} else if(userResidentID.length() != 13) {
			session.setAttribute("modal", new ModalUtil("오류 메시지", "주민등록번호는 13자리로 입력해주세요.", ModalUtil.ERROR));
		} else {
			session.setAttribute("userNameForJoin", userName);
			session.setAttribute("userResidentIDForJoin", userResidentID);
			session.setAttribute("modal", new ModalUtil("성공 메시지", "회원 정보를 기입하여 회원가입 해주세요.", ModalUtil.SUCCESS));
			viewPage = "userJoinView.reservation";
		}
		return new ActionForward(isRedirect, viewPage);
	}
	
}
