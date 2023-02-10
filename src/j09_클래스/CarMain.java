package j09_클래스;

public class CarMain {

	public static void main(String[] args) {
		/*
		 * 실습
		 * Car 라는 클래스 생성
		 * 		company
		 * 		model
		 * 		color
		 * 
		 * 메소드 showInfo()
		 * 		회사명 : 000
		 * 		모델명 : 000
		 * 		색상 : 000
		 * 
		 * 3대 (car1, car2, car3)
		 * 현대자동차
		 * 쏘나타
		 * 화이트
		 * 
		 * 기아
		 * K5
		 * 블랙
		 * 
		 * 현대자동차
		 * 아반떼
		 * 그레이
		 * 
		 * 각각 주입하고 showInfo 찍어서 값 확인
		 */
		
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		car1.company = "현대자동차";
		car1.model = "쏘나타";
		car1.color = "화이트";
		
		car2.company = "기아";
		car2.model = "K5";
		car2.color = "블랙";
		
		car3.company = "현대자동차";
		car3.model = "아반떼";
		car3.color = "그레이";
		
		car1.showInfo();
		car2.showInfo();
		car3.showInfo();
		
//		System.out.println(new Car());
		
	}

}
