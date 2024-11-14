package ch04_03;

public class BreakTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		
		while (a>=0) {
			a++;
			System.out.println(a + "번 입장하였습니다");
			if (a == 10) {
				break;
			}
		}

	}

}
