package reservation.command.seat;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import reservation.dao.BbsDAO;
import reservation.dao.MovieDAO;
import reservation.dao.SeatDAO;
import reservation.dto.BbsDTO;
import reservation.dto.MovieDTO;
import reservation.dto.SeatDTO;
import reservation.frontController.ActionForward;
import reservation.util.ModalUtil;
import reservation.util.Pair;
import reservation.util.Third;
import reservatoin.command.Command;

public class SeatSelectViewCommand implements Command {

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		boolean isRedirect = false;
		String viewPage = "seatSelectView.jsp";
		HttpSession session = request.getSession();
		int movieID = 0;
		if (request.getParameter("movieID") != null) {
			movieID = Integer.parseInt(request.getParameter("movieID"));
		}
		if(movieID == 0) {
			session.setAttribute("modal", new ModalUtil("오류 메시지", "유효하지 않습니다.", ModalUtil.ERROR));
			viewPage = "mainView.reservation";
			isRedirect = true;
		} else {
			SeatDAO seatDAO = new SeatDAO();
			ArrayList<SeatDTO> list = seatDAO.getList(movieID);
			ArrayList<Third<String, String, Boolean>> result = new ArrayList<Third<String, String, Boolean>>();
			for(int i = 1; i <= 264; i++) {
				boolean finded = false;
				for(int j = 0; j < list.size(); j++) {
					if(i == list.get(j).getSeatID()) {
						finded = true;
					}
				}
				String temp = "";
				if(i < 10) temp += "00";
				else if(i < 100) temp += "0";
				temp += i;
				if(finded) result.add(new Third<String, String, Boolean>(i + "", temp, true));
				else result.add(new Third<String, String, Boolean>(i + "", temp, false));
			}
			request.setAttribute("list", result);
		}
		return new ActionForward(isRedirect, viewPage);
	}
	
}
