package reservation.command.movie;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import reservation.dao.BbsDAO;
import reservation.dao.MovieDAO;
import reservation.dto.BbsDTO;
import reservation.dto.MovieDTO;
import reservation.frontController.ActionForward;
import reservatoin.command.Command;

public class MovieManageViewCommand implements Command {

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		boolean isRedirect = false;
		String viewPage = "movieManageView.jsp";
		MovieDAO movieDAO = new MovieDAO();
		ArrayList<MovieDTO> list = movieDAO.getList();
		request.setAttribute("list", list);
		return new ActionForward(isRedirect, viewPage);
	}
	
}
