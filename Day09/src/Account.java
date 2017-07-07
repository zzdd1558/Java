import java.util.Scanner;

public class Account {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean check = true;
		int AccountTotalMoney = 0;
		while (check) {

			System.out.println("1.입금 | 2.출금 | 3.잔고 |4. 종료");
			System.out.println("--------------------------");
			System.out.print("선택> ");
			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				boolean depositCheck = true;
				int depositMoney = 0;
				while(depositCheck){
					System.out.print("입금액> ");
					depositMoney = scan.nextInt();
					if(depositMoney < 0){
						System.out.println("0보다 큰수를 입력하세요");
						System.out.println();
						continue;
					}
					depositCheck = false;
				}
				
				AccountTotalMoney += depositMoney;
				System.out.println("입금액 : " + depositMoney + " 잔고 : " + AccountTotalMoney);
				System.out.println();
				break;
			case 2:
				boolean withdrawCheck = true;
				int withdraw = 0;
				while (withdrawCheck) {
					System.out.print("출금액 > ");
					withdraw = scan.nextInt();
					if (withdraw < 0) {
						System.out.println("0보다 큰수를 입력하세요.");
						System.out.println();
						continue;
					}else if( withdraw > AccountTotalMoney){
						System.out.println("잔고가 부족합니다");
						System.out.println();
						continue;
					}
					withdrawCheck = false;
				}
				
				AccountTotalMoney -= withdraw;
				System.out.println("출금액 : " + withdraw + " 잔고 : " + AccountTotalMoney);
				System.out.println();

				break;
			case 3:
				System.out.println("잔고 > " + AccountTotalMoney );
				System.out.println();
				break;
			case 4:
				System.out.println("프로그램 종료");
				check = false;
				break;

			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			}

		}

	}
} // end of class
