


// 주석 : 컴파일 되지 않는다 , 메모

//한줄주석 : //시작 , 행의 끝까지
/* 부분주석 , 여러줄 주석 : 시작과 끝이 지정됨 */


/*
 * 여러줄
 * 작성
 * 가능함
 */

/**
 * 
 * 다큐먼트 주석 : 부분 주석, 여러줄주석과사용방법이 동일
 * 클래스, 메서드 , 변수 선언부 앞에 작성하여 , 의미를설명하는 용도
 * ex) 작성자, 작성일, 어떤기능, 버그에 대한 이슈, 인자값, 리턴값 정의
 *
 */
public class Hello3 { //클래스: public class 의 클래스명 = 파일명과 같아야 한다.

	//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello"); //화면에 Hello를 출력
		System.out.println(365);
		System.out.println(3.141592); //콘솔창을 통해, 모니터에 출력후 줄바꿈 println();
	}// end of main

} // end of class