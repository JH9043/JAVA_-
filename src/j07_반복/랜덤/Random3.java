package j07_반복.랜덤;

import java.util.Random;

public class Random3 {

	public static void main(String[] args) {
		
		/*
		 * 실습
		 * a, b, c 값 비교
		 * 반복은 20회 일어나고 a, b, c의 범위는 50
		 */
		Random random = new Random();
		int i = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int max = 0;
		
		while(i < 20) {
			a = random.nextInt(50);
			b = random.nextInt(50);
			c = random.nextInt(50);
//			if (a > b){
//				if(c > a) {
//					max = c;
//				} else { // a > c
//					max = a;
//				}
//			} else { // b > a
//				if(c > b) {
//					max = c;
//				} else { // c < b
//					max = b;
//				}
//			}
			
//			
//			if(a > b){
//				if(max < a) {
//					max = a;
//				}
//			}else {
//				if(max < b) {
//					max = b;
//				}
//			}
//			if(max < c) {
//				max = c;
//			}
//			i++;
			
//			풀이2
			if(a > b || max < a){
					max = a;
			}else {
				if(max < b) {
					max = b;
				}
			}
			if(max < c) {
				max = c;
			}
			i++;
			
			
			System.out.println("a = " + a);
			System.out.println("b = " + b);
			System.out.println("c = " + c);
			System.out.println("max = " + max);
			i++;
			System.out.println("==========================");
		}
		
		
	}

}
