package j09_클래스.접근지정자.user;

public class UserMain {
	/*
	 * userId -> jonghak,  userName -> 김종학
	 * 1. 전체 생성자 써서 값 주입
	 * 2. 각각 생성자 써서 값 주임
	 */
	
	public static void main(String[] args) {
		User user = new User("jonghak","김종학");
		User user2 = new User();
		user2.setUserId("jonghak");
		user2.setUserName("김종학");
		
		user.showInfo();
		
		System.out.println(user2.getUserId());
		System.out.println(user2.getUserName());
	}
}
