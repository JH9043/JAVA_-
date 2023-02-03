package j06_조건;

public class If2_2 {

	public static void main(String[] args) {

		/*
		 * 문제 "돈이 3,000원 이상있고 카드가 있다면 택시를 타고,
		 * 돈이 3,000원 이하이거나 카드만 있다면 버스를 타라
		 * 그렇지 않으면 걸어가라
		 */
		int money = 3000;
		boolean card = false;
		String result = null;
		if (money >= 3000 && card == true) {
			result = "택시를 타라";
		} else if (money < 3000 || card == true) {
			result = "버스를 타라";
		} else {
			result = "걸어가라";
		}
		
		System.out.println(result);
	}

}
