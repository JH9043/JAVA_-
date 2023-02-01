package j04_문자열;

public class String1 {
	public static void main(String[] args) {
//		System.out.println("안녕하세요");
//		System.out.println("\"안녕\"하세\n요");
//		System.out.println("오늘\t날씨\t따듯");

		// \가 이스케이프 문자이다

		String address = "부산시 진구 가야동";
		int age = 10;

		int index1 = address.indexOf("동"); // 자기가 찾는 글자 위치를 알려줌
		System.out.println(index1);

		String address2 = "부산시 동래구 사직동";

		int index2 = address2.indexOf("동");
		System.out.println(index2);

		int index3 = address2.lastIndexOf("동");
		System.out.println(index3);

		String subAddress = address2.substring(0, 3);
		System.out.println(subAddress);

		String subAddress2 = address2.substring(0, 4);
		System.out.println(subAddress2);

		/*
		 * 문제 "부산광역시 서구 부민동" 에서 indexOf, lastIndexOf를 사용해서 "부산광역시 서구" 까지 출력
		 */

		String address3 = "부산광역시 서구 부민동";
		int index4 = address3.indexOf("부");
		int index5 = address3.lastIndexOf(" ");
		System.out.println(index4);
		System.out.println(index5);
		String subAddress3 = address3.substring(index4, index5);
		System.out.println(subAddress3);

		String replaceAddress = address3.replace(' ', '-');
		System.out.println(replaceAddress);

		String replaceAddressAll = address3.replaceAll(" 서", " 북");
		System.out.println(replaceAddressAll);
		
		String phoneNumbers = "010/3300/4698, 010/1234/5678";
		/*
		 * 문제
		 * 010을 011로 다 바꿔라, /를 -으로 바꿔라, ', '를 ' /'로 바꿔라
		 */
		String rePhone = phoneNumbers.replaceAll("010", "011");
		rePhone = rePhone.replace('/', '-');
		rePhone = rePhone.replaceAll(", ", "/");
		System.out.println(rePhone);

		String rePhone2 = phoneNumbers.replaceAll("010", "011")
						  .replace('/', '-')
						  .replaceAll(", ", "/");
		System.out.println(rePhone2);
	}
}
