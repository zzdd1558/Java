import java.util.Scanner;

public class Z09_SwitchQuiz2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int firstNum, secondNum, result = 0;
		String oper;
		System.out.print("첫번째 수 : ");
		firstNum = scan.nextInt();
		System.out.print("연산자 : ");
		oper = scan.next();
		System.out.print("두번째 수 : ");
		secondNum = scan.nextInt();
		
		switch(oper){
		case "+" : 
			result = firstNum + secondNum;
			break;
		case "-" : 
			result = firstNum - secondNum;
			break;
		case "*" : 
			result = firstNum * secondNum;
			break;
		case "/" : 
			result = firstNum / secondNum;
			break;
		}
		
		System.out.println(firstNum + " " + oper + " " + secondNum + " = " + result);
	}
}
