import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author yunjin 자바의 흐름제어 : if~else , switch ~ case , 삼항연산자
 */
public class Z02_IfElse {
	public static void main(String[] args) throws IOException {
		// if(조건식){ // 조건식 : true or false 만 올 수 있다.
		// 참일경우 수행할 문장
		// }

		int n = 4;
		if (n > 3) {// 참일경우
			System.out.println(n + "가(이) 3보다 큼");
		} else { // 거짓일경우
			System.out.println(n + "은 3보다 작음");
		}

		//num의 값이 홀수 인지 짝수 인지
		int num = 7;
		if(num %2 == 0){
			System.out.println("짝수");
		}else{
			System.out.println("홀수");
		}
			
		
		char c = 'w';
		
		if('A'<=c && c<= 'Z'){
			System.out.println("대문자");
		}else if('a'<= c && c <= 'z'){
			System.out.println("소문자");
		}
		
		
//		양수 , 음수 , 0
		num = -3;
		System.out.println(num == 0 ? 0 : (num>0 ? "양수" : "음수"));
		
		
//		
		n=14;
		if(n%6 ==0){
			System.out.println("6의 배수이다");
		}else if( n% 3 ==0){
			System.out.println("3의 배수이다");
		}else if(n % 2== 0 ){
			System.out.println("2의 배수이다");
		}
		
		
		
//		3개 이상의 값을 비교하여 최솟값을 출력할대는 변수를 이용한다.
		int x = 3;
		int y = 1;
		int z = 4;
		int min=x; // 최소값을 저장할 변수
		//최
		 // 초기값을 저장하 ㄹ변수 - 초기값의 중요
		if(min > y)	min = y;
		if(min > z)	min = z;
		
	} // end of main
} // end of class
