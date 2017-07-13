
/**
 * 최고조상 Object 클래스의 hashcode() 메서드
 * Object의 hashCode() : 객체의 주소를 기반으로 생성한다.
 * String 의 hashCode() : 객체의 저장된 문자열 기반으로 hashCode값이 생선된다.
 */
public class HashCode {
	public static void main(String[] args) {
		Cup c1 = new Cup();
		Cup c2 = new Cup();
		Cup c3 = c2;
		System.out.println(c1); // Object의 hashCode()를 호출
		System.out.println(c2);
		System.out.println(c3);

		// Object의 hashCode() : 객체의 주소를 기반으로 생성한다.

		String s1 = new String("abc");
		String s2 = new String("abc");

		// hashCode()는 같게 나온다
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1 == s2); // false 출력
		//String 의 hashCode() : 객체의 저장된 문자열 기반으로 hashCode값이 생성된다.
		
	
	} // end of main
} // end of class

class Cup {

}