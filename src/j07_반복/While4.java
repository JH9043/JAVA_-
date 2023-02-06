package j07_반복;

public class While4 {

	public static void main(String[] args) {

		// 구구단
		int dan = 2;
		int num = 0;

		while(num < 9){
			System.out.println(dan + " X " + (num + 1) + " = " + (dan * (num + 1)));
			num++;
		}
		
		
		/*
		 * 2 X 1 = 2
		 * 2 X 2 = 4
		 *...
		 * 2 X 9 = 18
		 */
	}

}
