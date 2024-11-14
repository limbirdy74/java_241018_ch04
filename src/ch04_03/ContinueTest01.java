package ch04_03;

public class ContinueTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// continue 문 - 돌려보내는 것임
		
		for (int i = 1; i<= 100; i++) {
			if (i % 2 != 0) {  // 홀수이면 걸림. for 문으로 다시 돌려보냄
				continue;
			}
			System.out.println(i + "는 짝수입니다");  // 짝수만 찍음
			
		}
	}

}
