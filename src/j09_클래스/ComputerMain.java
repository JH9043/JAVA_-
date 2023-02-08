package j09_클래스;

public class ComputerMain {

	public static void main(String[] args) {
		System.out.println(new Computer());
		
		System.out.println(new Computer());
		
		Computer c1 = new Computer();
		Computer c2 = new Computer();
		
		c1.cpu = "i7";
		c2.cpu = "i5";
		
		c1.showInfo();
		c2.showInfo();
	}

}
