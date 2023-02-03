package j07_반복;

public class While2 {

	public static void main(String[] args) {
		/*
		 * 문제. 아래와 같이 출력이 되게 while문으로 작성하시오
		 * 김종학101
		 * 김종학102
		 * 김종학103
		 * 김종학104
		 * 김종학105
		 * 김종학106
		 * 김종학107
		 * 김종학108
		 * 김종학109
		 * 김종학110
		 * 김종학111
		 * 김종학112
		 */
		int count = 0;
		while(count<12) {
			int num = count+1;
			if(num<10) {
				System.out.println("김종학10"+num);
			}else {
				System.out.println("김종학1"+num);
			}
			count++;
		}
		
		//다른 풀이
		int i = 0;
		while(i <12) {
			System.out.println("김종학" + (i + 101));
			i++;
		}
		
	}

}
