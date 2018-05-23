package reservation.command.bbs;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import reservation.dao.BbsDAO;
import reservation.dto.BbsDTO;
import reservation.frontController.ActionForward;
import reservatoin.command.Command;

public class BoardListViewCommand implements Command {

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		boolean isRedirect = false;
		String viewPage = "boardListView.jsp";
		int pageNumber = 1;
		if (request.getParameter("pageNumber") != null) {
			pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
		}
		BbsDAO bbsDAO = new BbsDAO();
		ArrayList<BbsDTO> list = bbsDAO.getList(pageNumber);
		request.setAttribute("list", list);
		request.setAttribute("pageNumber", pageNumber);
		return new ActionForward(isRedirect, viewPage);
	}
	
}
