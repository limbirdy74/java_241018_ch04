package ch04_02;

import java.util.Iterator;

public class ForTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println("100까지의 합은 : " + sum);
	}

}
