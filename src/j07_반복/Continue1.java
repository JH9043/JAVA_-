package j07_반복;

public class Continue1 {

	public static void main(String[] args) {

//		for(int i = 0;i < 10;i++) {
//			int num = i + 1;
//			if (num % 2 == 0) {
//				System.out.println("continue 전");
//				continue;
//			}
//			System.out.println("num : " + num);	
//		}

		/*
		 * 실습! continue를 사용하여 1부터 100까지 수 중 홀수의 합 구하기
		 */
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			int num = i + 1;
			if (num % 2 == 0) {
				continue;
			}
			sum += num;
		}
		System.out.println("1 ~ 100까지 홀수의 합 : " + sum);
	}

}
