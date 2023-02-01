package j04_문자열;

public class StringBuilder2 {
	public static void main(String[] args) {
		String names = "김종학님, 도경록님, 이다운님, 신수영님";
		String names1 = names.substring(0, 4);
		String names2 = names.substring(6, 10);
		String names3 = names.substring(12, 16);
		String names4 = names.substring(18, 22);
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(names1 + "/" + names2 + "/" + names3 + "/" + names4);
		System.out.println(stringBuilder.toString());
		/*
		 * 문제
		 * 이름만 잘라서 슬러시로 구분해서 넣기
		 */
	}
}
