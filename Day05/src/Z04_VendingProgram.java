import java.util.Scanner;

public class Z04_VendingProgram {
	private static int coin;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean flag = true;

		System.out.print("돈을 넣어주세요 : ");
		coin = scan.nextInt();

		while (flag) {
			System.out.println();
			System.out.println("<자판기 메뉴>");
			System.out.println("1. 콜라 : 1220원");
			System.out.println("2. 사이다 : 990원");
			System.out.println("3. 써니텐 : 880원");
			System.out.println("4. 환타 : 720원");
			System.out.println("5. 물 : 510원");
			System.out.println("6. 새우깡 : 1360원");
			System.out.println("7. 포카칩 : 1110원");
			System.out.println("8. 감자깡 : 840원");
			System.out.println("9. 컵라면 : 1530원");
			System.out.println("0. 종료 ");
			System.out.println("--------------");
			System.out.println("현재 잔액 : " + coin);
			System.out.print("메뉴 입력 : ");
			int choice = scan.nextInt();
			switch (choice) {

			case 1:
				selectMenu("콜라", 1220);

				break;

			case 2:
				selectMenu("사이다", 990);
				break;

			case 3:
				selectMenu("써니텐", 880);
				break;

			case 4:
				selectMenu("환타", 720);
				break;

			case 5:
				selectMenu("물", 510);
				break;

			case 6:
				selectMenu("새우깡", 1360);
				break;

			case 7:
				selectMenu("포카칩", 1110);
				break;

			case 8:
				selectMenu("감자깡", 840);
				break;
			case 9:
				selectMenu("컵라면", 1530);
				break;
			case 0:
				System.out.println("자판기 종료");

				int money = 10000;
				boolean moneyFlag = true;
				while (money >= 10) {
					System.out.println(money + "원의 갯수 : " + coin / money);
					coin = coin % money;

					if (moneyFlag) {
						money /= 2;
						moneyFlag = false;
					} else {
						money /= 5;
						moneyFlag = true;
					}
				}
				flag = false;
				break;

			default:
				break;
			}// end of switch
		} // end of while

	}// end of main

	public static void selectMenu(String name, int value) {
		System.out.println(coin + " : " + name + " : " + value);
		if (coin < value) {
			System.out.println("잔액이 부족합니다");
		} else {
			System.out.println("※ " + name + " 선택!");
			System.out.println(coin + " : " + value);
			coin = coin - value;
		}

	}
	
}// end of class
