package j10_배열;

public class Array1 {
	public static void main(String[] args) {
		// 정수 배열
		int[] numbers = new int[5];

		// 문자열 배열
		String[] strArray = new String[5];
		strArray[0] = "가";
		strArray[1] = "나";
		strArray[2] = "다";
		strArray[3] = "라";
		strArray[4] = "마";

		numbers[0] = 5;
		numbers[1] = 10;
		numbers[2] = 20;
		numbers[3] = 30;
		numbers[4] = 40;

		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[0]);
		
		System.out.println(strArray[0]);
		System.out.println(strArray[1]);
		System.out.println(strArray[2]);
	}
}
