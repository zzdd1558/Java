
public class Z08_mart {
	public static void main(String[] args) {
		
		Mart eMart = new Mart();
		Mart LotteMart = new Mart();
		Mart LotteSuper = new Mart();
		
		
		eMart.name = "이마트";
		eMart.ball = 1500;
		eMart.pen = 700;
		
		System.out.println("마트 이름 : " + eMart.name+" ,  ball : " + eMart.ball + " , pen : " + eMart.pen);
		
		LotteMart.name = "롯데마트";
		LotteMart.ball = 1300;
		LotteMart.pen = 900;
		
		System.out.println("마트 이름 : " + LotteMart.name+" ,  ball : " + LotteMart.ball + " , pen : " + LotteMart.pen);
		
		LotteSuper.name = "롯데슈퍼";
		LotteSuper.ball = 500;
		LotteSuper.pen = 300;
		
		System.out.println("마트 이름 : " + LotteSuper.name+" ,  ball : " + LotteSuper.ball + " , pen : " + LotteSuper.pen);
		
	}
}




class Mart{
	String name;
	int ball;
	int pen;
	
}