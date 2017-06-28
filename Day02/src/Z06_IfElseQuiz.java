import java.util.Scanner;

/**
 * @author yunjin 조건식을 활용한 Quiz
 */
public class Z06_IfElseQuiz {
	public static void main(String[] args) {

		/*
		 * 몸무게(kg)와 키(cm)를 사용자에게 입력을 받아 비만인지 판별하여 출력
		 * 
		 * 신체 질량 지수(BMI) = 체중(kg) / [신장(m)]2 <-제곱
		 * 저체중 20 미만 
		 * 정상 20이상 - 25미만 
		 * 과체중 25이상 - 30미만 
		 * 비만 30이상
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("몸무게를 입력하세요(kg) : ");
		int weight = scan.nextInt();
		System.out.print("키를 입력하세요(cm) : ");
		int height = scan.nextInt();
		
		double heightM = (height /100.);
		double myBmi = weight / (heightM * heightM);

		if (myBmi >= 30) {
			System.out.println("비만");
		} else if (myBmi >= 25) {
			System.out.println("과체중");
		} else if (myBmi >= 20) {
			System.out.println("정상");
		} else {
			System.out.println("저체중");
		}

	}// end of main
} // end of class