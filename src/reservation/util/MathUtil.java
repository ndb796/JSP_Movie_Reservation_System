package reservation.util;

import java.util.Random;

public class MathUtil {
	
	// 알파벳과 숫자를 포함하는 무작위 12자리 문자열을 생성하는 메소드입니다.
	public static String getPasswordCode() {
		StringBuffer temp = new StringBuffer();
		Random rnd = new Random();
		for (int i = 0; i < 12; i++) {
			int j = rnd.nextInt(2);
			switch (j) {
				case 0:
					temp.append((rnd.nextInt(10)));
					break;
				case 1:
					temp.append((char) ((int) (rnd.nextInt(26)) + 65));
			}
		}
		return temp.toString();
	}
	
}
