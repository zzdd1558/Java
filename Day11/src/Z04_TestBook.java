
public class Z04_TestBook {
	public static void main(String[] args) {
		Book book = new Book();
		
		book.setName("홍길동전");
		book.setPublisher("길동이네");
		book.setPrice(15000);
		
		System.out.println("책이름 : " + book.getName() + ", 출판사 : " + book.getPublisher() + ", 가격 : " + book.getPrice());
	} // end of main
} // end of class


class Book{
	private String name="";
	private String publisher = "";
	private int price ;
	
	public Book() {
		// TODO Auto-generated constructor stub
		super();
	}
	public Book(String name, String publisher, int price) {
		super();
		this.name = name;
		this.publisher = publisher;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
