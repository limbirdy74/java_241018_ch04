package ch04_03;

public class DoWhileTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 11;
		
		while (a>10) {
			System.out.println("안녕하세요1!" + a);
			a--;
		}
		
		//  do ~ while 한번은 실행함
		do {
			System.out.println("안녕하세요2!" + a);
			a--;
		} while (a>10);
	}

}
