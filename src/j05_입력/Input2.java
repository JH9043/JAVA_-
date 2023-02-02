package j05_입력;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {

		/*
		 * 문제
		 * 입력 
		 * 이름 : 김종학 				next() 		변수명 : name 
		 * 생일 : 226					nextInt() 			 birth 
		 * 주소 : 부산 서구 충무동		nextLine() 			 address
		 * 연락처 : 010-7696-2433 		next() 				 phone
		 * 
		 * 출력
		 * 사용자의 이름은 김종학이고 생일은 226입니다.
		 * 주소는 부산 서구 충무동에 거주중입니다.연락처는 010-7696-2433 입니다.
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		String name = null;
		int birth = 0;
		String address = null;
		String phone = null;
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("생일 : ");
		birth = sc.nextInt();
		
		sc.nextLine();
		System.out.print("주소 : ");
		address = sc.nextLine();
		System.out.print("연락처 : ");
		phone = sc.next();
		System.out.println("사용자의 이름은 " + name + "이고 생일은 " + birth + "입니다.");
		System.out.println("주소는 " + address + "에 거주중입니다.");
		System.out.println("연락처는 " + phone + " 입니다.");
	}

}
