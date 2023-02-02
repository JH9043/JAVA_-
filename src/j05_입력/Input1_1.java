package j05_입력;

import java.util.Scanner;
public class Input1_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = null;
		String str2 = null;
		int num = 0;
		
		System.out.print("내용을 입력하세요 : ");
		str = sc.nextLine();
		System.out.println("출력 : " + str);
		
		System.out.println("내용을 입력하세요 : ");
		str2 = sc.nextLine();
		
		System.out.println("내용을 입력하세요 : ");
		num = sc.nextInt();
	}

}
