package j09_클래스.접근지정자.user;

public class User {
	private String userId;
	private String userName;

	public User(String userId, String userName) {
		this.userId = userId;
		this.userName = userName;
	}

	// 매개변수 하나만 받는 생성자는 오버로딩이 안됨
	// 매개변수 갯수와 자료형이 동일해서 안됨
	// set,get으로 우회해서 넣으면 됨
	
	void showInfo() {
		System.out.println(userId);
		System.out.println(userName);
	}
	public User() {
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
