
/**
 * @author yunjin
 * 연산자 : 단항 연산자, 이항 연산자 , 삼항 연산자, 대입 연산자
 */

public class Z02_Operator {
	public static void main(String[] args) {
		
//		단한 연산자 :  피연산자의 개수가 1개뿐인 연산자
//		종류 : ++ , -- , ! , ~
		//증감 연산자 ++ --
		int a = 3;
		a++; // a = a + 1; 후치 증감 연산자 : 참조 후 증감.
		System.out.println(a);
		
		a = 3;
		System.out.println(a++); // 출력결과 : 3  연산을 하기전에 출력을 했기 때문에 3을 출력
		System.out.println(a); // 출력결과 : 4 위에서 3을 출력후 ++이 되었기 때문에 4가 출력된다.
		
		
		
		a = 3;
		System.out.println(++a); // 출력결과 : 4 : ++a : 전치 증감 연산자 : 증감 후 참조.
		System.out.println(a); //이미 값이 증가하였기때문에 4가 출력된다.
		
		
		a = 3;
		System.out.println(a--); // 출력결과 : 3 : 후치 증감 연산자 : 참조 후 증감
		System.out.println(a); // 출력결과 : 2
		
		
		a = 3;
		System.out.println(--a); //출력결과 : 2 : 증감 후 참조
		System.out.println(a);
		
		
		a = 3;
		int b = ++a + ++a + a++ + a++; //가독성이 떨어짐 ( 나쁜 코드 )
		System.out.println(b);
		
		
//		부호 연산자 : + -
		a = 3;
		System.out.println(-a);
		
		
		
//		논리 부정 연산자 ! : boolean 타입의 갑에만 사용 가능.
		boolean flag = true;
		System.out.println(flag);
		System.out.println(!flag);

		
//		비트 부정 연산자 ~ : 
		System.out.println(~3); //2진수의 각 비트를 반대로 바꿔줌.
		
		
		
//		이항 연산자 : 피연산자의 개수가 2개 , 산술 , 비트 , 논리 , 비교
//		이항 연산자의 특징 : 두 피연산자의 타입이 같아야 한다.
//					다를 경우 컴파일러가 같은타입으로 자동 형변환을 해준다.(데이터의 손실이 없는 방향)
//					데이터의 손실이 없는 큰 타입 방향으로 형변환됨.
//					연산 결과도 같은 타입으로 리턴된다.
		
		System.out.println(7+3); // 10
		System.out.println(7-3); // 4
		System.out.println(7*3); // 21
		System.out.println(7/3); // 2 몫 연산 (이항 연산자의 특징)
		System.out.println((double)7/3); // 2.3333이 출력 (데이터 손실이 더적은 double 형으로 형변환을 하기때문에 소수점도 표현 가능)
		System.out.println(7%3); // 1 나머지 연산
		
//		비트연산자 & | ^
		System.out.println(7 & 13); // 비트가 둘다 1이면 1 
		System.out.println(7 | 13); // 비트가 하나라도 1이라면 1
		System.out.println(7 ^ 13); // 비트가 같으면 0 다르면 1
		
		int key = 7413;//암호화용 열쇠
		int date = 2345; // 데이터
		
		int x = date ^ key; // 암호화
		System.out.println(x); // 암호화된 데이터 출력
		
		
		x = x ^ key; // 복호화 진행
		System.out.println(x);// 복호화된 데이터.
		
		
//		논리 연산자 & |    앞에부분과 뒤에부분을 같이 실행
		System.out.println(false & false);	//false
		System.out.println(false & true);	//false
		System.out.println(true & false);	//false
		System.out.println(true & true);	//true
		
		
		System.out.println(false | false);	//false
		System.out.println(false | true);	//true
		System.out.println(true | false);	//true
		System.out.println(true | true);	//true
		
		
//		논리 연산자 && ||    앞에부분을 실행후 false 면 뒤에있는 boolean은 확인 안함
		System.out.println(false && false);	//false
		System.out.println(false && true);	//false
		System.out.println(true && false);	//false
		System.out.println(true && true);	//true
		
		
		System.out.println(false || false);	//false
		System.out.println(false || true);	//true
		System.out.println(true || false);	//true
		System.out.println(true || true);	//true
		
//		비교 연산자 <= , >= , < , > , == , !=
		System.out.println(3 <= 5);			//true
		System.out.println(3 > 5);			//false
		System.out.println(3 == 5);			//false
		System.out.println(3 != 5);			//true
		
//		삼항 연산자 - 피연산자의 개수가 3개인 연산자
//		(조건식) ? (참일경우) : (거짓일경우)
		int y = 3 < 5 ? 10 : 0;
		System.out.println(y);
		System.out.println(3 == 5 ? "안녕" : 100);
		
//		대입 연산자 : = 와 이항연산자의 조합
		int c = 3;
		c += 2; //c = c + 2;
		c -= 2; //c = c - 2;
		c *= 2; //c = c * 2;
		c /= 2; //c = c / 2;
		c %= 2; //c = c % 2;
		c &= 2; //c = c & 2;
		c |= 2; //c = c | 2;
		c ^= 2; //c = c ^ 2;
		
		int p ,q,t;
		p = q = t = 4; // 오른쪽에서 왼쪽으로 연산되어 온다.
		
	}//end of main
}//end of class