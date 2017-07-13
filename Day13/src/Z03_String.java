
public class Z03_String {
	public static void main(String[] args) {
		int a = 3;
		X m = new X(); // 기본형이 아닌 참조형의 객체 생성 방법

		String s = new String("abc"); // 참조형 타입
		String s2 = "abc"; // 특별히 String 클래스만 이런 방식 가능

		String s3 = "abc";
		String s4 = "abc";

		String s5 = new String("abc");
		String s6 = new String("abc");

		if (s3 == s4)
			System.out.println("같다");
		else
			System.out.println("다르다");

		if (s5 == s6)
			System.out.println("같다");
		else
			System.out.println("다르다");

		if (s3.equals(s4))
			System.out.println("같다");
		else
			System.out.println("다르다");

		if (s5.equals(s6))
			System.out.println("같다");
		else
			System.out.println("다르다");

		System.out.println(s5);
		System.out.println(s5.toString());
		

	} // end of main
} // end of class

class X {

}