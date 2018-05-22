package reservation.frontController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import reservation.command.user.UserLoginCommand;
import reservation.util.ServerUtil;
import reservatoin.command.Command;

@WebServlet("*.reservation")
public class FrontController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		action(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		action(request, response);
	}
	
	private void action(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		Command command = null;
		ActionForward forward = null;
		
		String URI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String target = URI.substring(contextPath.length());
	
		/* 회원 - 단순 View 처리(Forward 처리) */
		if(target.equals(ServerUtil.relativePath + "userLoginView.reservation")) {
			forward = new ActionForward(false, "userLoginView.jsp");
		} else if(target.equals(ServerUtil.relativePath + "mainView.reservation")) {
			forward = new ActionForward(false, "mainView.jsp");
		}
		
		/* 회원 - 삽입/수정/삭제 처리 (Forward 처리) */
		else if(target.equals(ServerUtil.relativePath + "userLoginAction.reservation")) {
			command = new UserLoginCommand();
			forward = command.execute(request, response);
		} 
		
		if(forward.isRedirect()) {
			response.sendRedirect(forward.getViewPage());
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getViewPage());
			dispatcher.forward(request, response);
		}
	}
	
}
