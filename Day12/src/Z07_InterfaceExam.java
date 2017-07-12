
public class Z07_InterfaceExam {
	public static void main(String[] args) {
		ProductInter tv = new Television("삼성", "파브" , 2500000 ,  48);
		tv.displayProductInfo();
		ProductInter computer = new Computer("삼성" , "시리즈 9" , 1800000 , 500 , 16);
		computer.displayProductInfo();
	} // end of main
} // end of class

interface ProductInter {
	void displayProductInfo();
}

abstract class Product implements ProductInter {
	String company = ""; // 제품 제조사
	String name = ""; // 제품 명
	int price; // 제품 가격

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String company, String name, int price) {
		super();
		this.company = company;
		this.name = name;
		this.price = price;
	}

}

class Television extends Product {
	int inchSize; // 화면 사이즈

	public Television() {
		// TODO Auto-generated constructor stub
	}

	public Television(int inchSize) {
		super();
		this.inchSize = inchSize;
	}

	public Television(String company, String name, int price, int inchSize) {
		super(company, name, price);
		this.inchSize = inchSize;
	}

	@Override
	public void displayProductInfo() {
		// TODO Auto-generated method stub
		System.out.println("TV size : " + inchSize + " | 제조사 : " + company + " | 제품명 : " + name + " | 가격 : " + price);

	}

}

class Computer extends Product {
	int hddSize; // 하드디스크 사이즈
	int memorySize; // 메모리 사이즈

	@Override
	public void displayProductInfo() {
		// TODO Auto-generated method stub
		System.out.println("Computer 제조사 : " + company + " | 제품명 : " + name + " | 가격 : " + price + " | hddSize : "
				+ hddSize + "GB | memorySize : " + memorySize + "GB");

	}

	public Computer() {
		// TODO Auto-generated constructor stub
	}

	public Computer(int hddSize, int memorySize) {
		super();
		this.hddSize = hddSize;
		this.memorySize = memorySize;
	}

	public Computer(String company, String name, int price, int hddSize, int memoSize) {
		super(company, name, price);
		this.hddSize = hddSize;
		this.memorySize = memorySize;
	}

}