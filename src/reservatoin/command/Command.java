package reservatoin.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import reservation.frontController.ActionForward;

// 컨트롤러 실행 구문의 형태를 잡아줍니다.
public interface Command {

	ActionForward execute(HttpServletRequest request, HttpServletResponse response);

}