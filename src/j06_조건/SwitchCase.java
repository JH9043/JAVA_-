package j06_조건;

public class SwitchCase {

	public static void main(String[] args) {
		switch (25) {
		case 10:
			System.out.println("10입니다.");
		case 20:
			System.out.println("20입니다.");
		case 30:
			System.out.println("30입니다.");
		case 40:
			System.out.println("40입니다.");
		case 50:
			System.out.println("50입니다.");
		}
		String select = "40";
		switch (select) {
		case "10":
			System.out.println("10입니다.");
		case "20":
			System.out.println("20입니다.");
		case "30":
			System.out.println("30입니다.");
			break;
		case "40":
			System.out.println("40입니다.");
		case "50":
			System.out.println("50입니다.");
		default:
			System.out.println("그 외에 실행");
			
//		default는 무조건 실행된다(우선순위는 break > default)
		}
	}

}
