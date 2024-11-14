package ch04_03;

public class CH05_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = "홍길동";
		String name2 = "홍길동";
		
		
		if (name1 == name2) {
			System.out.println("name1과 name2는 같은 객체를 참조하고 있습니다");
		} else {
			System.out.println("name1과 name2는 다른 객체를 참조하고 있습니다");
		}

		// new 연산자
		String name3 = new String("홍길동");
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		if (name1 == name3) {
			System.out.println("name1과 name3는 같은 객체를 참조하고 있습니다");
		} else {
			System.out.println("name1과 name3는 다른 객체를 참조하고 있습니다");
		}
		
		// 문자열 등의 참조타입 비교 
		// 문자열(참조타입) 비교는 equals 로 해라 == 는 숫자만 해라
		if (name1.equals(name3)) {
			System.out.println("name1과 name3는 같은 문자열입니다");
		} else {
			System.out.println("name1과 name3는 다른 문자열입니다");
		}
	}
}
