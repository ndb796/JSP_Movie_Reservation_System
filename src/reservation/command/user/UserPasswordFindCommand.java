package reservation.command.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import reservation.frontController.ActionForward;
import reservation.util.MathUtil;
import reservation.util.ServerUtil;
import reservatoin.command.Command;

public class UserPasswordFindCommand implements Command {
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		boolean isRedirect = false;
	    String viewPage = "getAjaxResultView.jsp";
	    String userID = null;
	    String userEmail = null;
		String authenticationNumber = MathUtil.getPasswordCode();
	    String json = "-1";
	    
	    if(request.getParameter("userID") != null) {
	    	userID = request.getParameter("userID");
	    } if(request.getParameter("userEmail") != null) {
	    	userEmail = request.getParameter("userEmail");
	    }
	    
	    if(userEmail.equals("")) {
	    	json = "-5"; // 이메일 데이터가 오지 않은 경우
	    } else if(!userEmail.contains("@")) {
	    	json = "-4"; // @를 포함하지 않는 경우
	    } else if(userEmail.length() < 5 || userEmail.length() > 50) {
	    	json = "-3"; // 이메일 주소의 길이가 맞지 않은 경우
	    } else { // 입력한 이메일 주소가 정상인 경우 처리해줍니다.
		    EmailAuthenticationDAO emailAuthenticationDAO = new EmailAuthenticationDAO();
		    int result = emailAuthenticationDAO.getCurrentAutheticationTimeDifference(emailAddress);
		    if(result >= 0 && result < 60) { // 인증번호를 1분 이내로 보낸 적이 있는 경우를 처리해줍니다.
		    	json = "-2"; // 이메일을 발송한 지 1분이 지나지 않은 경우
		    } else { // 현재 인증번호를 보낼 수 있는 경우
				String from = SMTPUtil.getAdminEmail();
				String to = emailAddress;
				String subject = "[JES] 인증 번호를 전송해드립니다.";
				String content = "<p style='font-size: 14px; font-family: Nanum Gothic;'>회원님의 병원의 인증 번호는 <strong>" +
								 authenticationNumber + "</strong> 입니다.";
				
				Properties p = new Properties();
				p.put("mail.smtp.user", from);
				p.put("mail.smtp.host", "smtp.googlemail.com");
				p.put("mail.smtp.port", "465");
				p.put("mail.smtp.starttls.enable", "true");
				p.put("mail.smtp.auth", "true");
				p.put("mail.smtp.debug", "true");
				p.put("mail.smtp.socketFactory.port", "465");
				p.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
				p.put("mail.smtp.socketFactory.fallback", "false");
				
				try {
					Authenticator auth = new SMTPUtil();
					Session ses = Session.getInstance(p, auth);
					ses.setDebug(true);
					MimeMessage msg = new MimeMessage(ses);
					msg.setSubject(subject);
					Address fromAddr = new InternetAddress(from);
					msg.setFrom(fromAddr);
					Address toAddr = new InternetAddress(to);
					msg.addRecipient(Message.RecipientType.TO, toAddr);
					msg.setContent(content, "text/html;charset=UTF8");
					Transport.send(msg);
					result = emailAuthenticationDAO.sendAuthenticationNumber(emailAddress, authenticationNumber);
				    if(result == 1) {
				    	json = "1"; // 발송 성공
				    } else if(result == -1){
				    	json = "-1"; // 기타 오류 발생
				    }
				} catch (Exception e) {
			    	json = "-1"; // 기타 오류 발생
				}
		    }
	    }
	    
	    request.setAttribute("json", json);
		return new ActionForward(isRedirect, viewPage);
	}
}
