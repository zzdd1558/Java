
/**
 * 
 * String
 * StringBuffer : 멀티 쓰레드용
 * StringBuilder : 단일스레드용
 *
 */
public class Z07_StringBuffer {
	public static void main(String[] args) {
		String str = "abcdefghijk";
		StringBuilder sb = new StringBuilder(str); // 문자열 -> StringBuilder
		p("문자열 String 로 변환 : " + sb.toString()); // 출력결과 : 문자열 String 로 변환 : abcdefghijk
		p("문자열 추출 : " + sb.substring(3,7)); // 출력결과 : 문자열 추출 : defg
		p("문자열 연결 : " + sb.append("xyz")); // 출력결과 : 문자열 연결 : abcdefghijkxyz
		p("문자열의 길이 : " + sb.length()); // 출력결과 : 문자열의 길이 : 14
		p("용량의 크기 : " + sb.capacity()); // 출력결과 : 용량의 크기 : 27
		p("문자열 역순 변경 : "  + sb.reverse()); // 출력결과 : 문자열 역순 변경 : zyxkjihgfedcba
		
		//StringBuilder의 메서드는 원본에영향을 끼친다
		p("문자열 String 로 변환 : " + sb.toString()); // 출력결과 : 문자열 String 로 변환 : zyxkjihgfedcba
		
		System.out.println();
		System.out.println();
		
		String str2 = "abcdefghij";
		StringBuilder sb2 = new StringBuilder(str2); // 타입 변환
		sb2.reverse();
		
		p(sb2.toString()); // 출력결과 : jihgfedcba
		
		
	} // end of main
	
	public static void p(String str){
		System.out.println(str);
	}
} // end of class
