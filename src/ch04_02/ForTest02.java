package ch04_02;

public class ForTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 ~ 10 사이 짝수의 합
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("1 ~ 10 짝수의 합은 : " + sum);
	}

}
