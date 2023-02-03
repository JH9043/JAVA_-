package j06_조건;

public class If3 {

	public static void main(String[] args) {

		/*
		 * int x = 0; int y = 0; String result = null;
		 * 
		 * 풀이
		 * 
		 * System.out.println("x: " + x); System.out.println("y: " + y);
		 * System.out.println("결과 : " + result); *result는 x, y 값에 따라 1사분면, 2사분면, 3사분면,
		 * 4사분면
		 */

		int x = 9;
		int y = -13;
		String result = null;

		if (x > 0 && y > 0) {
			result = "1사분면";
		} else if (x < 0 && y > 0) {
			result = "2사분면";
		} else if (x < 0 && y < 0) {
			result = "3사분면";
		} else {
			result = "4사분면";
		}
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("결과 : " + result);
	}
}
