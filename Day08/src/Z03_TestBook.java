
public class Z03_TestBook {
	public static void main(String[] args) {

		
		//매번 값대입해주고 코드가 길어지고 비효율적임.
/*		Book book = new Book();
		Book book1 = new Book();
		
		book.name = "Do it 안드로이드";
		book.publisher = "이지스퍼블리싱";
		book.price = 23000;
		book.printBook();

		book1.name = "자바의 정석";
		book1.publisher = "남궁성씨";
		book1.price = 27000;
		book1.printBook();*/

		//출력결과 : 책이름 : 홍길동전 , 출판사 : 오늘출판사 , 가격 : 50000 이 되는것을 확인할 수 있다.
		//값을 넣지 않아도 생성자에 값을 넣어놨기때문에 매개변수가 없다면 생성자에서 저장된값을 출력한다		
		Book constBook = new Book();
		constBook.printBook();
		
		//출력결과 : 책이름 : 생성자의 활용 , 출판사 : 오늘출판사 , 가격 : 19000
		//객체를 생성함과동시에 매개변수로 name , publisher, price를 넘겼기 때문에
		//오버로딩된 생성자에서 값을 할당한다.
		Book constBook2 = new Book("생성자의 활용" , "오늘출판사" , 19000);
		constBook2.printBook();
		
		
		
		
		
		
	}// end of main
}// end of class

class Book {
	String name = "";
	String publisher = "";
	int price;
	
	//생성자 : 데이터의 초기화 , 메서드와 사용법이 흡사하다. 리턴값을 지정할 수 없다.
	//생성자의 이름은 클래스명과 동일해야한다. 소대문자 까지 똑같아야함.
	//매번 객체.name = "" , 객체.price = 200 이런식으로 하는건 코드가 매우 길어지기 때문에 생성자를 이용하면 간편하다
	
	//Book 클래스에 대한 생성자 메서드.
	Book(){
		name="홍길동전";
		publisher = "오늘출판사";
		price= 50000;
	}
	
	public Book(String name, String publisher, int price) {
		this.name = name;
		this.publisher = publisher;
		this.price = price;
	}

	void printBook() {
		System.out.println("책이름 : " + name + " , 출판사 : " + publisher + " , 가격 : " + price);
	}
}