
/**
 * @author yunjin
 *	static 변수 , 클래스 변수 , 공유 변수 
 */
public class Z05_Static {
	public static void main(String[] args) {
		MyCard c1 = new MyCard();
		c1.kind = "다이아몬드";
		c1.number = 7;
		
		MyCard c2 = new MyCard();
		c2.kind = "하트";
		c2.number = 1;
		
		// static 변수의 접근 방법
		// class명.static변수명
		// 객체 생성 없이도 사용할 수 있다.
		MyCard.width = 50;
		MyCard.height = 30;
		c1.printCard();
		c2.printCard();
		
		
		
				
	}  // end of main
} // end of class


class MyCard{
	String kind = "";
	int number;
	static int width;
	static int height;
	
	void printCard(){
		System.out.println(kind + " , " + number + " , " + width + " , " + height);
	}
	
}
