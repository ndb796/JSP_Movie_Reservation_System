package reservation.frontController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import reservation.command.user.UserLoginCommand;
import reservation.command.user.UserLogoutCommand;
import reservation.util.ServerUtil;
import reservatoin.command.Command;

@WebServlet("*.reservation")
public class FrontController extends HttpServlet {

	private static final long serialVersionUID = 1L;

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
		if(target.equals(ServerUtil.relativePath + "mainView.reservation")) {
			forward = new ActionForward(false, "mainView.jsp");
		} else if(target.equals(ServerUtil.relativePath + "userLoginView.reservation")) {
			forward = new ActionForward(false, "userLoginView.jsp");
		} else if(target.equals(ServerUtil.relativePath + "userConfirmView.reservation")) {
			forward = new ActionForward(false, "userConfirmView.jsp");
		} else if(target.equals(ServerUtil.relativePath + "userJoinView.reservation")) {
			forward = new ActionForward(false, "userJoinView.jsp");
		} else if(target.equals(ServerUtil.relativePath + "userFindView.reservation")) {
			forward = new ActionForward(false, "userFindView.jsp");
		} else if(target.equals(ServerUtil.relativePath + "userEditView.reservation")) {
			forward = new ActionForward(false, "userEditView.jsp");
		} else if(target.equals(ServerUtil.relativePath + "userDeleteView.reservation")) {
			forward = new ActionForward(false, "userDeleteView.jsp");
		} 
		
		else if(target.equals(ServerUtil.relativePath + "boardListView.reservation")) {
			forward = new ActionForward(false, "boardListView.jsp");
		} else if(target.equals(ServerUtil.relativePath + "boardWriteView.reservation")) {
			forward = new ActionForward(false, "boardWriteView.jsp");
		} else if(target.equals(ServerUtil.relativePath + "boardInfoView.reservation")) {
			forward = new ActionForward(false, "boardInfoView.jsp");
		} else if(target.equals(ServerUtil.relativePath + "boardEditView.reservation")) {
			forward = new ActionForward(false, "boardEditView.jsp");
		}
		
		else if(target.equals(ServerUtil.relativePath + "movieChartView.reservation")) {
			forward = new ActionForward(false, "movieChartView.jsp");
		} else if(target.equals(ServerUtil.relativePath + "payView.reservation")) {
			forward = new ActionForward(false, "payView.jsp");
		} else if(target.equals(ServerUtil.relativePath + "reservationView.reservation")) {
			forward = new ActionForward(false, "reservationView.jsp");
		} else if(target.equals(ServerUtil.relativePath + "qnaView.reservation")) {
			forward = new ActionForward(false, "qnaView.jsp");
		} else if(target.equals(ServerUtil.relativePath + "seatSelectView.reservation")) {
			forward = new ActionForward(false, "seatSelectView.jsp");
		}
		
				
		/* 회원 - 데이터 조회 처리(Forward 처리) */
		
		/* 회원 - 삽입/수정/삭제 처리 (Redirect 처리) */
		else if(target.equals(ServerUtil.relativePath + "userLoginAction.reservation")) {
			command = new UserLoginCommand();
			forward = command.execute(request, response);
		} else if(target.equals(ServerUtil.relativePath + "userLogoutAction.reservation")) {
			command = new UserLogoutCommand();
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
