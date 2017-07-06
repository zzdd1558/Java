
public class Z08_TestMart {
	public static void main(String[] args) {
		Mart Lotte = new Mart();
		Mart E = new Mart();
		
		
		Lotte.name = "롯데마트";
		Lotte.ball = 1500;
		Lotte.pen = 1000;
		Lotte.sale();
		
		
		
		
		E.name = "E마트";
		E.ball = 1000;
		E.pen = 700;
		E.sale();
		
		
		
		
	}// end of main
} // end of class




class Mart{
	String name;
	int ball;
	int pen;
	
	/** 10%할인된 가격 출력*/
	void sale(){
//		ball =(int)(ball / 0.9);// 이항연산 결과 double형이깨문에 형변환 필요
//		ball = ball - ball/10; // 정수의 이항연산만으로 처리
		ball *= 0.9; // 대입연산자에서는 형변환 없이 저장 가능
		pen *= 0.9;
		
		System.out.println("할인후 -------");
		printPrice(); // 참조변수 없이 멤버에 직접 접근 가능
	}
	
	/** 멤버 출력*/
	void printPrice(){
		System.out.println(name + "의 공의 가격 : " + ball + " 펜의 가격 : " + pen);
	}
		
}
