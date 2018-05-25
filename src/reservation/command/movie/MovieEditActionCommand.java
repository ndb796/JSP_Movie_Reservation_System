package reservation.command.movie;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import reservation.dao.BbsDAO;
import reservation.dao.MovieDAO;
import reservation.frontController.ActionForward;
import reservation.util.ModalUtil;
import reservatoin.command.Command;

public class MovieEditActionCommand implements Command {

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		boolean isRedirect = true;
		String viewPage = "movieManageView.reservation";
		HttpSession session = request.getSession();
		
		int movieID = -1;
		String movieTitle = null;
		String movieContent = null;
		String movieGenre = null;
		int movieTime = -1;

		if(request.getParameter("movieID") != null) {
			movieID = Integer.parseInt((String) request.getParameter("movieID"));
		}
		if(request.getParameter("movieTitle") != null) {
			movieTitle = (String) request.getParameter("movieTitle");
		}
		if(request.getParameter("movieContent") != null) {
			movieContent = (String) request.getParameter("movieContent");
		}
		if(request.getParameter("movieGenre") != null) {
			movieGenre = (String) request.getParameter("movieGenre");
		}
		if(request.getParameter("movieTime") != null) {
			movieTime = Integer.parseInt((String) request.getParameter("movieTime"));
		}

		if (movieID == -1 || movieTitle == null ||
			movieContent == null || movieGenre == null ||
			movieTime == -1) {
			session.setAttribute("modal", new ModalUtil("오류 메시지", "입력이 안 된 사항이 있습니다.", ModalUtil.ERROR));
			viewPage = "movieWriteView.reservation";
		} else {
			MovieDAO movieDAO = new MovieDAO();
			int result = movieDAO.update(movieID, movieTitle, movieContent, movieGenre, movieTime);
			if (result == -1) {
				session.setAttribute("modal", new ModalUtil("오류 메시지", "오류가 발생했습니다.", ModalUtil.ERROR));
				viewPage = "movieWriteView.reservation";
			} else {
				session.setAttribute("modal", new ModalUtil("성공 메시지", "성공적으로 수정했습니다.", ModalUtil.SUCCESS));
			}
		}
		
		return new ActionForward(isRedirect, viewPage);
	}
	
}
