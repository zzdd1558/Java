public class Z05_String {
	public static void main(String[] args) {
//		                         0123456789
		String str = new String("HelloWorld");
		
		System.out.println("oWorl 출력하기 : " + str.substring(4,9));
		System.out.println("str의 길이 출력 : " + str.length());
		
		String result="";
		for (int i = 0; i < str.length(); i++) {
			result = str.charAt(i) + result;
		}
		System.out.println("문자열을 역순으로 출력하기 : " + result);
		
		System.out.println(str.replace("ll","LL"));
		
		System.out.println("모두 대문자로 출력 : " + str.toUpperCase());
		System.out.println("모두 소문자로 출력 : " + str.toLowerCase());
		
		
	} // end of main
} // end of class
