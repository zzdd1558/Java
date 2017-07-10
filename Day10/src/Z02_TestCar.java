
public class Z02_TestCar {
	public static void main(String[] args) {
		SportsCar car = new SportsCar("K5",4,"black",false);
		
		
		car.print();
	}
}



class Car{
	String name="";
	int door;
	String color="";
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	
	//Car클래스의 name과 door , color을 만드는 생성자메서드.
	Car(String name , int door , String color){
		this.name = name;
		this.door = door;
		this.color = color;
	}
}



class SportsCar extends Car{
	boolean openRoof;
	public SportsCar() {
		// TODO Auto-generated constructor stub
	}

	//openRoof에 대한 생성자.
	SportsCar(boolean openRoof){
		this.openRoof = openRoof;
	}
	
	
	//Car 클래스의 생성자를 super()를 이용해 사용한다.
	SportsCar(String name , int door , String color,boolean openRoof){
//		super(name,door,color);
		this.name = name;
		this.door = door;
		this.color = color;
		this.openRoof = openRoof;
	}
	
	
	
	void print(){
		System.out.println("자동차 이름 : " + name + " 문짝의 개수 : " + door + "  색상 : " + color + " 오픈루프 : " + (openRoof ? " 열림 " : " 닫힘 "));
	}
}
