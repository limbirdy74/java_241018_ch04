package ch04_01;

public class SwitchTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String blood = "A";
		
		switch (blood) {
		case "A":
			System.out.println("A형 입니다");
			break;
		case "B":
			System.out.println("B형 입니다");
			break;
		case "AB":
			System.out.println("AB형 입니다");
			break;
		case "O":
			System.out.println("O형 입니다");
			break;

		default:
			System.out.println("잘못된 혈액형 입니다");
			break;
		}
		
		if (blood == "A") {
			System.out.println("A형 입니다");
		} else if (blood == "B") {
			System.out.println("B형 입니다");
		} else if (blood == "AB") {
			System.out.println("AB형 입니다");
		} else if (blood == "O") {
			System.out.println("O형 입니다");
		} else {
			System.out.println("잘못된 혈액형 입니다");
		}

	}

}
