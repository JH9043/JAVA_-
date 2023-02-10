package j09_클래스.생성자;

public class ConstructorEx2 {
	String hat;
	int pants;;
	
	//Args -> Arguments(인수, 매개변수)
	
	//NoArgsConstructor
	public ConstructorEx2() {
		
	}

	//RequiredArgsConstructor
	public ConstructorEx2(String hat) {
		this.hat = hat;
	}

	//RequiredArgsConstructor
	public ConstructorEx2(int pants) {
		this.pants = pants;
	}

	//AllArgsConstructor
	public ConstructorEx2(String hat, int pants) {
		this.hat = hat;
		this.pants = pants;
	}
	
	
	
	
	
}
