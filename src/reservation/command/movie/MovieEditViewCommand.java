package reservation.command.movie;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import reservation.dao.BbsDAO;
import reservation.dao.MovieDAO;
import reservation.dto.BbsDTO;
import reservation.dto.MovieDTO;
import reservation.frontController.ActionForward;
import reservation.util.ModalUtil;
import reservatoin.command.Command;

public class MovieEditViewCommand implements Command {

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		boolean isRedirect = false;
		String viewPage = "movieEditView.jsp";
		HttpSession session = request.getSession();
		int movieID = 0;
		if (request.getParameter("movieID") != null) {
			movieID = Integer.parseInt(request.getParameter("movieID"));
		}
		if(movieID == 0) {
			session.setAttribute("modal", new ModalUtil("오류 메시지", "유효하지 않은 글입니다.", ModalUtil.ERROR));
			viewPage = "mainView.reservation";
			isRedirect = true;
		} else {
			MovieDTO movie = new MovieDAO().getmovie(movieID);
			if(movie == null) {
				session.setAttribute("modal", new ModalUtil("오류 메시지", "유효하지 않은 글입니다.", ModalUtil.ERROR));
				viewPage = "mainView.reservation";
				isRedirect = true;
			}
			request.setAttribute("movie", movie);
		}
		return new ActionForward(isRedirect, viewPage);
	}
	
}
