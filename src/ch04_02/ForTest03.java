package ch04_02;

public class ForTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		System.out.println("-----------------");
		for (int i = 0; i < 10; i = i + 2) {  // int i 는 for문 안에서만 사용되는 지역변수로 위에 쓰고 다시 선언해도 된다
			System.out.println(i);            // 보기쉽게 j 로 바꿔주는 것도 좋겠지
		}
		
//		int j = 100;  오류남. 두번 선언 할 수는 없다
//		int j = 10;
	}

}
