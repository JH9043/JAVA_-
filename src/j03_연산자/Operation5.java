package j03_연산자;

public class Operation5 {

	public static void main(String[] args) {
		/*
		 * 문제
		 * 
		 * score에 점수 넣기
		 * 
		 * 89점보다 크면 (A학점)
		 * 79보다 크면(B학점)
		 * 69보다 크면(C학점)
		 * 59보다 크면(D학점)
		 * 나머지는 F학점
		 * 점수가 0보다 작거나 100보다 크면 '계산 불가'
		 * 최종 출력 : 결과 : B학점
		 */
		int score = 82;
		String result = null;
		
		result = score > 100 || score < 0 ? "계산 불가"
						: score > 89 ? "A학점" 
						: score > 79 ? "B학점" 
						: score > 69 ? "C학점" 
						: score > 59 ? "D학점" 
						: "F학점";
						
		System.out.println("결과 : " + result);
	}

}
