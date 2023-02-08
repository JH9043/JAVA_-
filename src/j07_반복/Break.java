package j07_반복;

public class Break {

	public static void main(String[] args) {
		// 커피자판기
		int coffee = 10;
		int money = 300;

		while (money > 0) {
			System.out.println("돈을 받았으니 커피를 줍니다.");
			coffee--;
			System.out.println("남은 커피의 양은 " + coffee + "입니다.");
			for (int i = 0; i < 5; i++) {
				System.out.println(i);
				if (coffee == 0) {
					System.out.println("판매를 중지합니다.");
					break;
					/*
					 * break
					 * 1. 반복문에서 멈추는 기능
					 * 2. 반복문을 빠져 나감
					 * 3. 하나만 빠져 나감 (중요!)
					 */
				}
			}
		}
	}

}
