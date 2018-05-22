package reservation.util;

import java.io.BufferedReader;
import java.io.FileReader;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class SMTPUtil extends Authenticator {

	@Override
	protected PasswordAuthentication getPasswordAuthentication() {
		PasswordAuthentication authentication = null;
	    try {
			// 텍스트 파일에는 한 줄씩 SMTP 아이디, 비밀번호를 입력하여 관리합니다.
	        BufferedReader in = new BufferedReader(new FileReader(ServerUtil.authenticationPath + "SMTP.txt"));
	        String ID = in.readLine();
	        String Password = in.readLine();
	        in.close();
	        authentication = new PasswordAuthentication(ID, Password);
	      } catch (Exception e) {
	          System.err.println(e);
	      }
		return authentication;
	}
	
	public static String getAdminEmail() {
	    try {
			// 텍스트 파일에는 한 줄씩 SMTP 아이디, 비밀번호를 입력하여 관리합니다.
	        BufferedReader in = new BufferedReader(new FileReader(ServerUtil.authenticationPath + "SMTP.txt"));
	        String ID = in.readLine();
	        in.close();
	        return ID;
	      } catch (Exception e) {
	          System.err.println(e);
	      }
	    return null;
	}	
	
}