
/**
 * @author yunjin
 * 클래스 활용
 */
public class Z02_TestCard {
	public static void main(String[] args) {
			Card c1 = new Card();
			System.out.println(c1.kind + " , " + c1.number);
			c1.kind = "하트";
			c1.number = 7;
			
			
			Card c2 = new Card();
			c2.number=1;
			
			
			//객체별로 kind와 number가 다르기 때문에 객체에 따른 ppp()내부에 있는 Syso출력
			
			c1.printCrad();
			c2.printCrad();
	} // end of main
} //end of class


class Card{ // 클래스 정의 : 변수 , 메서드
	
	//null 초기값 => String 문자열은 ""로 초기화 하자.
	String kind = ""; 
	int number; // 0 초기값
	
	
	// 메서드 : 실행문들의 묶음
	//리턴 타입 = 반환 타입 ,   인자값 = 매개변수 = 파라미터             사람마다 다르게 말하니 비슷하다는것만 알아두면 좋을것같다.
	//리턴타입 메서드명(인자값)
	void printCrad(){
		System.out.println("카드 무늬 : "  + kind + " , " + number);
	}
}