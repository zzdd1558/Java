package com.kosta.java;

/**
 * 제어자 ( Modifier ) - 접근제어자 , 그 외 제어자
 * static ( 공통의 , 클래스의 ) : 멤버 변수 , 메서드
 * final ( 마지막의 , 변경할수 없는 ): 클래스 , 메서드 , 멤버변수 , 지역변수
 * abstract( 추상의 , 미구현의 ) : 클래스 , 메서드.
 * 접근제어자 : public , protected , (default) , private
 * 
 */


// 하나의 파일에 public 을 사용할 수 있는 클래스는 파일명과 동일한 이름의 클래스만 가능.
public class Z11_Modifier {
	public static void main(String[] args) {
		
	} // end of main
} // end of class


class TT{ // (default) 접근 : 같은 클래스 , 같은 패키지 까지만 사용가능.
	public int a; // 모두 접근가능.
	protected int b; // 내클래스 , 같은 패키지 , 상속관계에서사용가능
	int c; // 내클래스 , 같은 패키지 사용가능
	private int d;// 내클래스 , 내부에서만 사용가능.
		//private 데이터의 보안(안전) , 내부적으로만 사용되는 변수.
}