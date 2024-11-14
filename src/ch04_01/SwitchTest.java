package ch04_01;

public class SwitchTest {

	public static void main(String[] args) {

		int score = 175;
		switch (score) {
		case 70:
			System.out.println("좋음");
			break;
		case 75:
			System.out.println("보통");
			break;  // break 가 없으면 일치한 case 하위문장이 모두 실행된다
		case 80:
			System.out.println("매우좋음");
			break;

		default:  // 모든 케이스에 해당하지 않는다면 default문장 실행. 생략 가능
			System.out.println("하하하");
			break;
		}
	}

}
