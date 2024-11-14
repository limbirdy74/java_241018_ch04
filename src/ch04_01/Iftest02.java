package ch04_01;

public class Iftest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 75;
		
		if (score >= 90) {
			System.out.println("수");
		} else if (score >= 80) {
			System.out.println("우");
		} else if (score >= 70) {
			System.out.println("미");
		} else if (score >= 60) {
			System.out.println("양");
		} else {
			System.out.println("가");
		}
		
		int score2 = 60;
		if (score2 > 50 && score2 > 60) {  // 논리연산자 사용이 하나의 () 로 묶어야 한다. 각가 하면 오류남
			
		}
	}

}
