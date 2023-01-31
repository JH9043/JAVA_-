package j02_변수와상수;

public class Constant {

	public static void main(String[] args) {
		final int MAX_NUMBER = 100;
		final int MIN_NUMBER = 0;

		int number = 10; //변수의 선언과 초기화를 한 번에 한 것
		System.out.println(number);
		number = 20;

//		maxNumber = 200; // 상수 => 바꿀 수 없는 수

		int number2; //변수 선언
		number2 = 200; //초기화와 동시에 대입
		
		

		System.out.println("최댓값 : " + MAX_NUMBER);
		System.out.println("최솟값 : " + MIN_NUMBER);
		System.out.println("현재값 : " + number);

		// 자동완성 단축키 : Ctrl + Spacebar

	}

}
