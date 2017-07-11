
/**
 * 다형성 ( Polymorphism ) 기본예제 2의 변형
 * 
 */
public class Z09_Polymorphism {
	public static void main(String[] args) {
		
		// 예제(2) 의 내용들을 배열로 바꿔보았다.
		// 부모 클래스로 배열을 생성한뒤
		// 각각의 인덱스에 Parents와 , Child1 , Child2의 객체를 생성해준다.
		Parents[] array = new Parents[3];
		array[0] = new Parents(0);
		array[1] = new Child1(1);
		array[2] = new Child2(2);
		
		
		// 반복문을 돌면서 array[i] instanceof를 통해 객체 타입을 비교해 
		// 객체 타입에 따라 출력 하는 값이 다른것을 확인 할 수 있다.

		for (int i = 0; i < array.length; i++) {
			if( array[i] instanceof Child1){
				Child1 my = (Child1)array[i];
				System.out.println("Child1로 형변환 가능 값 : " + my.child1);
			}else if (array[i] instanceof Child2) {
				Child2 my = (Child2) array[i];
				System.out.println("Child2로 형변환 가능 값 : " + my.child2);
			}else if (array[i] instanceof Parents) {
				Parents my = (Parents) array[i];
				System.out.println(my.parents);
				
			}
		}
		
	} // end of main
} // end of class



class Parents {
	int parents;
	public Parents() {
		// TODO Auto-generated constructor stub
	}
	public Parents(int parents) {
		super();
		this.parents = parents;
	}
}

class Child1 extends Parents {
	int child1;
	public Child1() {
		// TODO Auto-generated constructor stub
	}
	public Child1(int child1) {
		// TODO Auto-generated constructor stub
		this.child1 = child1;
	}
}

class Child2 extends Parents {
	int child2;
	public Child2() {
		// TODO Auto-generated constructor stub
	}
	public Child2(int child2) {
		// TODO Auto-generated constructor stub
		this.child2 = child2;
	}
}