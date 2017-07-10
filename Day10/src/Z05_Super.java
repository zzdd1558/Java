
/**
 * @author yunjin
 * this : 나 자신의 객체를 가리키는 참조 변수.
 * super : 나의 부모 클래스를 가리키는 참조 변수.
 */
public class Z05_Super {
	public static void main(String[] args) {
		GoodMan man = new GoodMan();
		man.print();
		
	} // end of main
} // end of class


class Man{
	String name = "";
	int age;
	
	public Man() { // 기본 생성자
		// TODO Auto-generated constructor stub
		//name 과 age가 설정되지 않았을경우 초기화작업을 해준다. 생성자의 첫번째줄에 작성해 주어야한다.
		// 도다른 생성자를 호출.
		this("홍길동",30);
	}
	
	public Man(String name, int age) {
		this.name = name;
		this.age = age;
	}



	String printMan(){ // 이름 , 나이를 문자열로 제공하는 메서드
		return name + ", 나이 : " + age; 
	}
}

class GoodMan extends Man{
	int money;
		
	
	//모든 생성자에는 반드시 또다른 생성자를 호출해야한다.
	// 또다른 생성자를 호출하지 않으면 , 컴파일러가 super() 부모의 기본생성자를 호출 해준다.
	public GoodMan() {
		// TODO Auto-generated constructor stub
		this(1000);
	}
	
	
	public GoodMan(int money) {
		// TODO Auto-generated constructor stub
		this.money = money;
	}
	
	
	GoodMan(String name , int age, int money){
		//부모의 생성자를 호출하는 키워드. super(...);
		//부모(Man)의 생성자를 통해서 초기화.
		
//		super.name = name;
//		super.age = age;
		
		super(name,age);
		this.money = money;
	}


	void print(){
//		System.out.println(super.name + "나이 : " + age +, 돈 : "+ money);
		System.out.println(super.printMan() + ", 돈 : "+ money);
	}
}