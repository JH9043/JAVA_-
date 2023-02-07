package j07_반복;

public class For2 {

	public static void main(String[] args) {
		// 구구단 (2단)
//		int dan = 2;
//		for (int i = 0; i < 9; i++) {
//			int num = i + 1;
//			System.out.println(dan + " X " + num + " = " + (dan * num));
//		}
		
		
		/*
		 * 2단
		 * 2 X 1 = 2
		 * 2 X 2 = 4
		 * ...
		 * 2 X 9 = 18
		 * 3단
		 * 3 X 1 = 3
		 * ...
		 * 3 X 9 = 27
		 * ...
		 * 9단
		 * 9 X 1 = 9
		 * ...
		 * 9 X 9 = 81
		 */
		for (int i = 0; i < 8; i++) {
			int dan2 = i + 2;
			System.out.println(dan2 + "단");
			for (int j = 0; j < 9; j++) {
				int num = j + 1;
				System.out.println(dan2 + " X " + num + " = " + (dan2 * num));
			}
		}
	}

}
