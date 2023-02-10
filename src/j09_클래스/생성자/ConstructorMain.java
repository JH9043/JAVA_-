package j09_클래스.생성자;

public class ConstructorMain {
	public static void main(String[] args) {
		ConstructorEx constructorEx1 = new ConstructorEx();
		ConstructorEx constructorEx2 = new ConstructorEx("김종학");
		
		System.out.println(constructorEx2.name);
		
		ConstructorEx constructorEx3 = new ConstructorEx(226);
		System.out.println(constructorEx3.birth);
		
		ConstructorEx constructorEx4 = new ConstructorEx("김종학", 226);
	}
}
