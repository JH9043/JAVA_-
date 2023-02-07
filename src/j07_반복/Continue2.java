package j07_반복;

public class Continue2 {
	public static void main(String[] args) {
//		String a = " ";
//		System.out.println(a.equals(" "));
//		
//		String b = "";
//		System.out.println(b);
//		String c = "김종학";
//		b += c;
//		System.out.println(b);
//		String d = "이다운";
//		b += d;
//		System.out.println(b);

		String address = "부산 동래구 사직동 중앙대로";
		String tempAddress = "";
		/*
		 * 실습 tempAddress를 출력하면 아래와 같이 나오도록 하시오
		 * 부산동래구사직동중앙대로
		 */
		for (int i = 0; i < address.length(); i++) {
			String str = address.substring(i, i + 1);
			if (str.equals(" ")) {
				continue;
			}
			tempAddress += str;
		}
		System.out.println(tempAddress);
	}
}
