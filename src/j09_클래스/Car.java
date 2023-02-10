package j09_클래스;

public class Car {
	String company;
	String model;
	String color;
	
	public Car() {
		System.out.println("기본 생성자 호출");
	}
	
	void showInfo() {
		System.out.println("회사명 : " + company);
		System.out.println("모델명 : " + model);
		System.out.println("색상 : " + color);
	}
}
