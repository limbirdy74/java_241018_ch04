package ch04_02;

public class ForTest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// scores = [90, 85, 78, 65, 97] -> 파이썬 리스트
		// 자바는 배열을 사용함
		// 80점 이상 합격, 아니면 불합격. 메세지 출력시 학생번호 출력
		// 합격자 수 를 출력하시오
		int[] scores = {90, 85, 78, 65, 97};
		int pass = 0;
		int total = 0;
		
		for (int i = 0; i < 5; i++) {
//			System.out.println(scores[i]);
			if (scores[i] >= 80) {
				System.out.println(i+1 + "번 학생 합격 입니다");
				pass = pass + 1;
			} else {
				System.out.println(i+1 + "번 학생 불합격 입니다");
			}
			total = total + 1;
		}
		System.out.println("총 "+ total+ "명 중에 합격한 사람은 " + pass + "명 입니다");
		// 향상된 for 문
		for (int score:scores) {
			System.out.println(score);
		}
	}

}
