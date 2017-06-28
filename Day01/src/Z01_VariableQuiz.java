/**
 * @author yunjin
 * 변수의 활용
 */
public class Z01_VariableQuiz {
	public static void main(String[] args) {
		
	// 사과의 개수 10을 저장할 수 있는 변수 작성 후 출력		
		int numOfApple = 10;
		
	/* 상수에서 카멜표기법을 쓰지못하기대문에 가독성이 떨어진다
	 * 상수의 경우에는 MY_NAME (언더바)로 구분을 해준다.
	*/
	//나의 이름 ( 변경되지 않음 ) 저장할 변수 작성 후 출력
		final String NAME = "최윤진";
		
	//나의 나이를 저장할 변수 작성 후 10년후 나이를 출력
		int age = 10;
		
		System.out.println("사과의 개수 : " + numOfApple);
		System.out.println("나의 이름은 : " + NAME);
		System.out.println("10년 후 나의 나이는 : " + (age+10));
		
		
		
	//char타입의 소문자를 대문자로 변경해서 출력하세요
		char small = 'c';
		
		//small - 32를 할경우 67이 나온다 그이유는
		// 컴파일러가 int형으로 형변환시켰을때 데이터의 손실이 더 없을것으로 계산하고 int로 계산.
		// 계산은 좀 더하겠지만 가독성을위해 small - 32가 아닌 small - ('a' - 'A')를 사용한다
		System.out.println((char)(small - ('a' - 'A')));
				
		
	//swap 값의 교환
		int a = 3;
		int b = 5;
		System.out.println(a + " : " + b);  //출력 결과 3,5
		
		
		System.out.println(a + " : " + b);
		
		int tmp = a;
		a = b;
		b = tmp;
		
		System.out.println(a + " : " + b); // 출력 결과 5 , 3
		
	}
}