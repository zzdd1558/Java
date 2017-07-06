 
/**
 * @author yunjin
 *	클래스의 활용
 */
public class TestCard {
	public static void main(String[] args) {
		Card c1 = new Card();
		c1.kind = "스페이스";
		c1.number = 5;
		System.out.println("카드의 무늬 : " + c1.kind + ", 카드의 숫자 : " + c1.number);
		
		Card c2 = new Card();
		c2.kind = "다이아몬드";
		c2.number = 7;
		System.out.println("카드의 무늬 : " + c2.kind + ", 카드의 숫자 : " + c2.number);
		
		
	} //end of main
} // end of class




/**
 * @author yunjin
 * 카드의 한장을 추상화한 클래스
 */
class Card{
//	새로운 타입의 정의 =  추상화 작업
	
	/** 카드 한장의 무늬 (하트 , 다이아몬드 , 스페이드 , 클럽 )**/
	String kind;
	
	/** 카드 한장의 숫자 (1 ~ 13) **/
	int number;
}