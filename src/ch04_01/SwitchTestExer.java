package ch04_01;

public class SwitchTestExer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 3,5,7,8,10,12  -> 31일
		// 4,6,9,11 -> 30
		// 2 -> 28
		
		int month = 13;
		
		switch (month) {
		case 1: 
		case 3: 
		case 5: 
		case 7: 
		case 8:
		case 10:
		case 12:
			System.out.println("31일");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일");
			break;
		case 2:
			System.out.println("28일");
			break;
		
		default:
			System.out.println("잘못된 월입니다. 1~12 사이의 값을 입력해주세요.입력월 : "  + month);
			break;
		}
	}

}
