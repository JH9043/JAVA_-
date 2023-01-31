package j01_출력;

public class MyInfo {

	public static void main(String[] args) {
		char name1 = '김';
		char name2 = '종';
		char name3 = '학';

//		char name4 = '김종학';

		String name4 = "김종학";
		// int, char, double 등은 기본 자료형
		// String은 클래스 자료형
		int birth = 226;
		System.out.print("이름 : ");
		System.out.println(name1 + name2 + name3+ ""); // 각 아스키코드를 10진수로 바꾼 값들이 합쳐진다
		System.out.println(name4);
		System.out.print("생일 : ");
		System.out.println(birth);

	}

}
