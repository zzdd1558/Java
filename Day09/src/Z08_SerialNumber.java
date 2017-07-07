
/**
 * @author yunjin
 *	생성자 활용
 */
public class Z08_SerialNumber {
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();
		Product p5 = new Product();
				
		
		p1.printSN();
		p2.printSN();
		p3.printSN();
		p4.printSN();
		p5.printSN();
	} // end of main
} // end of class



class Product{
	static  int num;
	int serialNumber;
	
	public Product() {
		// TODO Auto-generated constructor stub
		serialNumber = num++;
	}
	void printSN(){
		System.out.println("시리얼 넘버 : " + serialNumber);
	}
}