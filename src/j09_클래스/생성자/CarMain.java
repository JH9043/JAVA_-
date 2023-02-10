package j09_클래스.생성자;

public class CarMain {
	public static void main(String[] args) {
		Car car1= new Car("현대자동차", "쏘나타", "화이트");
		Car car2 = new Car("기아", "K5", "블랙");
		Car car3= new Car("현대자동차", "아반떼", "그레이");
		
		System.out.println("회사 : " + car1.company);
		System.out.println("모델 : " + car1.model);
		System.out.println("색상 : " + car1.color);
		
		System.out.println("회사 : " + car2.company);
		System.out.println("모델 : " + car2.model);
		System.out.println("색상 : " + car2.color);
		
		System.out.println("회사 : " + car3.company);
		System.out.println("모델 : " + car3.model);
		System.out.println("색상 : " + car3.color);
	}
}
