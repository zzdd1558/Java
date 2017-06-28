
/**
 * @author yunjin
 * @Variable ( 변수 ) : 데이터를 메모리에 저장하는 공간, 변할 수 있는 수
 */
public class Z01_Variable {
	public static void main(String[] args) { // start of main

		// 변수 : 프리미티브 , 참조형
		/*
		 * 기본형 : byte(1byte) , short (2byte) , 가장 기본 "int (4byte)" , long(8byte) 
		 * int가 연산속도가 제일빠르다 byte와 short에 비해 메모리는 낭비가 되지만 연산속도가 제일 빠르기 때문에 int 를 자주 사용한다
		 * 실수형 : float(4byte) , 가장 기본 "double(8byte)" 
		 * float와 double는 변수를 생성하는것도, 연산하는것도 오래걸린다. 꼭 써야한다면 마지막에 변환해서 사용해주는것이 좋다.
		 * 문자형 : char (2byte) 
		 * 논리형 : boolean (1byte) true와 false만 사용하지만 bit 보다는 byte계산이 빠르기 떄문에 1byte를 부여한다.
		 */

		int value; // 정수만 저장할 수 있는 변수. 메모리 : 4Byte
		value = 100; // 변수 초기화 ( 처음 값을 할당한다 )

		/* int value; // error을 발생. 같은 스코프 안에서는 변수명 중복이 불가능하다. */

		int intValue = 100; // 변수를 선언과 동시에 초기화
		byte byteValue = 1;
		short shortValue = 2;
		long longValue = 123456789001234L; // 리터럴 접미사 l or L
		
		int first,second,third; // 같은 타입의 변수를 여러개 한꺼번에 선언 가능
		
		float floatValue = 3.141592f;  // 리터러럴 접미사  f or F
		double doubleValue = 3.14;     //리터럴 접미사 d or D
		
		char charValue = 'x'; // 하나의 글자를 저장하기 위한 변수 ' ' (싱글포테이션으로 감싸주어야 한다);
		// charValue의 값에는 'x'에 대한 아스키코드값이 들어있따.
		
		//참 : true , 거짓 : false
		boolean booleanValue =false;
		System.out.println(booleanValue); //변수를 출력하면 , booleanValue에 저장된 데이터가 출력된다.
		
		//상수 표현 방법 : 변수명을 대문자로 표시한다.
		//상수 : 항상 동일한 수 , 값을 변경할 수 없다.
		final int AGE = 25;
		System.out.println(AGE);
		
		/*
		 * 변수명 명명 규칙
		 * 1. 동일한 이름으로 중복 불가, 예약어는 변수명으로 사용 불가.
		 * 2. 대소문자 구분함,  변수명의 길이의 제한이 없다.
		 * 3. 특수문자는 _(언더바) $(달러) 만 가능
		 * 4. 변수명은 숫자로 시작 하면 안된다( 숫자를 사용가능하지만 숫자를 맨처음에 사용하는것은 불가능)
		 * ex)  value2 (O) , 2value(x)
		 * 5. 변수명의 첫글자는 소문자로 시작, 새로운 단어의 첫글자는 대문자로 하자( 카멜 표기법 )
		 * ex) int numOfIndex = 0;  낙타 허리처럼 내려갔다 올라갔다 <- 카멜표기법
		 */
		
		//문자열 String : 참조형 타입
		String name = "최윤진";
		System.out.println(name);
		name = "김윤진";
		System.out.println(name);
		
		
		// 문자열의 덧셈 연산	
		name = "a" + "bc";	//문자열을 이어붙여주는 역할
		System.out.println(name);
		name = "a" + 3; 	//문자열 + 비 문자열 = 문자열
		System.out.println(name);
		
		
		//캐스팅
		
		
//		int num = 3.14; // 타입이 일치하지 않기 때문에 오류 발생. 이러한 경우 캐스팅을 사용할수 있다.
		int num  = (int)3.14;
		System.out.println(num); // 출력 결과 : 3
		
		// 타입이 일치하지 않으면 오류가 발생한다고 위에서 설명했지만 float타입의 변수에 3을 넣었을때는 오류가 발생하지 않는다.
		//데이터의 손실이 발생하지 않을 경우 : 컴파일러가 자동형변환 해준다.
		float floatNum = 3;   
		
		double doubleNum = 3.14f; // 자동 형변환
		long longNum = 10; //자동 형변환
//		int intNum = 300L; // 표현범위가 더 큰 자료 형에서 작은 자료형으로 형변환하려고 할시 데이터의 손실이 발생한다고 생각하여 오류를 알려준다
		
		//문자형의 형변환
		int castingInt = (int)'a';  // 'a'는 숫자 97을 뜻한다.
		System.out.println(castingInt); // 출력 결과 : 97
		
		castingInt = 98; // 98은 ASCII 코드로 'b'를 뜻한다.
		char castingChar = (char)castingInt;
		System.out.println(castingChar);  //출력 결과 : b
		
		//자동 형변환 : 타입의 손실되는 데이터가 없을 경우
		//강제 형변환 : 데이터의 손실이 발생할 수 있는 경우.
		
//		byte, short, int , long
//		float , double
//		정수형의 모든 타입들은 실수형에 자동형변환되어 들어갈수있다 . 이유는 실수가 더 많이 표현할수 있기 때문이다.
		float fff = 300L;
		
		

	} // end of main
} // end of class
