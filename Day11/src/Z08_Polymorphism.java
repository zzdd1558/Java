
/**
 * 다형성 : 부모의 참조변수에 자식의 객체를 저장할 수 있는 성질
 * 		만약 공통된 부모 클래스가 없다고 하면 Object 클래스가 클래스들의 가장 최상위 부모이기때문에 
 * 		Object로 묶을수 있다.
 */
public class Z08_Polymorphism {
	public static void main(String[] args) {

		
		//P 클래스를 통해 객체 par 생성
		P par = new P();
		
		//par객체의 멤버 p에 30 저장.
		par.p = 30;
		
		//print메서드의 배개변수로 par을 넘겨준다.
		print(par);

		//C1 클래스를 통해 객체 ch1 생성
		C1 ch1 = new C1();
		
		//ch1객체의 멤버 ca에 30 저장.
		ch1.ca = 100;
		
		//print메서드의 배개변수로 ch1을 넘겨준다.
		print(ch1);

		
		//C2 클래스를 통해 객체 ch2 생성
		C2 ch2 = new C2();
		
		//ch2객체의 멤버 cb에 70 저장.
		ch2.cb = 70;
		
		//print메서드의 배개변수로 ch2을 넘겨준다.
		print(ch2);

	} // end of main

	static void print(P par) { // 자기만의 변수를 출력
		
		//넘어온 매개변수 par이 각각의 클래스
		if (par instanceof C1) {
			C1 my = (C1) par;
			System.out.println("C1 : " + my.ca);
		}else if (par instanceof C2) {
			C2 my = (C2) par;
			System.out.println("C2 : " + my.cb);
		}else if(par instanceof P){ // 혹시나 par가 아닐경우도 나올수있기 때문에 확인사살겸 par도 조건을 걸어준다.
			System.out.println("P : " + par.p);
		}
	}

} // end of class

class P {
	int p;
}

class C1 extends P {
	int ca;
}

class C2 extends P {
	int cb;
}