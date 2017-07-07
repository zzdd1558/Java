import java.util.Arrays;

/**
 * @author yunjin
 * 메서드의 오버로딩 overloading : 같은 클래스 내에서 동일한 메서드명을 사용하는 기법
 * 			조건 : 매개변수의 개수 or 타입 or 순서가 달라야 한다.
 */
public class Z04_Overloading {
	public static void main(String[] args) {
		Z04_Overloading z = new Z04_Overloading();
				
		z.add(5,3);
		z.add(5,3.14);
		z.add(5.11,3);
		z.add(5.11,3.14);
		z.addtest(1,2,3,4,5,6);
	} // end of main
	
	
	void addtest(int ... args){
		//매개변수 가 몇개넘어 올지 모를때 매개변수를 다음과 같이 선언하면 
		// 갯수 상관없이 배열로 넘어온다
		System.out.println(Arrays.toString(args));
	}
	
	void add(int a, double b){
		System.out.println(a + b);
}// end of print()
	
	void add(double a, double b){
		System.out.println(a + b);
}// end of print()
	
	void add(double a, int b){
		System.out.println(a + b);
}// end of print()
	
	void add(int a, int b){
		System.out.println(a + b);
}// end of print()
	
	
} // end of class
