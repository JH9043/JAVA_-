package j04_문자열;

public class StringBuilder2 {
	public static void main(String[] args) {
		String names = "김종학님, 도경록님, 이다운님, 신수영님";
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(names.substring(0, 3) + "/" + names.substring(6, 9) + "/" + names.substring(12, 15) + "/"
				+ names.substring(18, 21));
		System.out.println(stringBuilder.toString());
		/*
		 * 문제 이름만 잘라서 슬러시로 구분해서 넣기
		 */

		String city = "진구, 서구, 북구";
		int index = city.indexOf("구");
		System.out.println(index);

		int index2 = city.indexOf("구", index + 1);
		System.out.println(index2);

		int index3 = names.indexOf("님");
		int index4 = names.indexOf("님", index3 + 1);
		int index5 = names.indexOf("님", index4 + 1);
		int index6 = names.lastIndexOf("님");
		int index7 = names.indexOf(" ");
		int index8 = names.indexOf(" ", index7 + 1);
		int index9 = names.indexOf(" ", index8 + 1);

		String names2 = names.substring(0, index3);
		String names3 = names.substring(index7 + 1, index4);
		String names4 = names.substring(index8 + 1, index5);
		String names5 = names.substring(index9 + 1, index6);
		System.out.println(names2 + "/" + names3 + "/" + names4 + "/" + names5);

		// 강사님 해설

		StringBuilder stringBuilder2 = new StringBuilder();
		int index10 = names.indexOf("님");
		stringBuilder2.append(names.substring(index10 - 3, index10));

		index10 = names.indexOf("님", index10 + 1);
		stringBuilder2.append("/");
		stringBuilder2.append(names.substring(index10 - 3, index10));

		index10 = names.indexOf("님", index10 + 1);
		stringBuilder2.append("/");
		stringBuilder2.append(names.substring(index10 - 3, index10));

		index10 = names.indexOf("님", index10 + 1);
		stringBuilder2.append("/");
		stringBuilder2.append(names.substring(index10 - 3, index10));
		System.out.println(stringBuilder2);

		System.out.println("--------------------------------------");
		System.out.println("삭제");

		StringBuilder stringBuilder3 = new StringBuilder();
		stringBuilder3.append(names);

		/*
		 * 문제 결과물 : 김종학도경록이다운신수영 (indexOf 사용하여 풀기)
		 */
		int index11 = stringBuilder3.indexOf("님");
		stringBuilder3.delete(index11, index11 + 3);
		index11 = stringBuilder3.indexOf("님");
		stringBuilder3.delete(index11, index11 + 3);
		index11 = stringBuilder3.indexOf("님");
		stringBuilder3.delete(index11, index11 + 3);
		index11 = stringBuilder3.indexOf("님");
		stringBuilder3.delete(index11, index11 + 3);
		System.out.println(stringBuilder3);

	}
}
