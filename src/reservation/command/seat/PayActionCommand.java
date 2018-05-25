package reservation.command.seat;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import reservation.dao.SeatDAO;
import reservation.frontController.ActionForward;
import reservation.util.ModalUtil;
import reservatoin.command.Command;

public class PayActionCommand implements Command {

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		boolean isRedirect = true;
		String viewPage = "payResultView.reservation";
		HttpSession session = request.getSession();
		String userID = null;
		if(session.getAttribute("userID") != null) {
			userID = (String) session.getAttribute("userID");
		}
		if(userID == null) {
			session.setAttribute("modal", new ModalUtil("오류 메시지", "로그인을 먼저 해주세요.", ModalUtil.ERROR));
			viewPage = "userLoginView.reservation";
		} else {
			int movieID = 0;
			if (request.getParameter("movieID") != null) {
				movieID = Integer.parseInt(request.getParameter("movieID"));
			}
			int seatID = -1;
			if (request.getParameter("seatID") != null) {
				seatID = Integer.parseInt(request.getParameter("seatID"));
			}
			if(movieID == 0 || seatID == -1) {
				session.setAttribute("modal", new ModalUtil("오류 메시지", "유효하지 않습니다.", ModalUtil.ERROR));
				viewPage = "mainView.reservation";
				isRedirect = true;
			} else {
				SeatDAO seatDAO = new SeatDAO();
				int result = seatDAO.write(movieID, userID, seatID);
				if (result == -1) {
					session.setAttribute("modal", new ModalUtil("오류 메시지", "오류가 발생했습니다.", ModalUtil.ERROR));
				} else {
					session.setAttribute("modal", new ModalUtil("성공 메시지", "성공적으로 결제되었습니다.", ModalUtil.SUCCESS));
				}
			}
		}
		
		return new ActionForward(isRedirect, viewPage);
	}
	
}