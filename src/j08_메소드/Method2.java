package j08_메소드;

public class Method2 {

	// 메소드 종류
	// 리턴값 없고 매개변수도 없는 메소드
	public static void test1() {
		System.out.println("test1 메소드 호출");
	}
	/*
	 * void는 리턴값이 없다는 뜻
	 */

	// 리턴값 없고 매개변수 한 개 있는 메소드
	public static void test2(int num) {
		System.out.println("num : " + num);
		System.out.println("test2 메소드 호출");
	}

	// 리턴값 없고 매개변수 두 개 있는 메소드
	public static void test3(int num, int num2) {
		System.out.println("num : " + num);
		System.out.println("num2 : " + num2);
		System.out.println("test3 메소드 호출");
	}

	// 리턴값 있고 매개변수 없는 메소드
	public static int test4() {
		System.out.println("test4 메소드 호출");
		return 100;
	}
	
	public static String test5(String name, int index) {
		System.out.println("name : " + name);
		System.out.println("index : " + index);
		return name + index;
	}

	public static void main(String[] args) {
		test1();
		test2(10);
		test3(100, 200);
		//test4();
		int a= test4();
		System.out.println();
		System.out.println(a);
		System.out.println();
		System.out.println(test4());
		
		String result = test5("김종학", 1);
		System.out.println();
		System.out.println(result);
		System.out.println();
		System.out.println(test5("김종학", 1));
	}
}
