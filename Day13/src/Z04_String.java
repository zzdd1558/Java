import java.util.Arrays;

/**
 * 유용한 클래스 String
 *
 */
public class Z04_String {
	public static void main(String[] args) {
		
//		            01234567
		String s = "abDfAgRe";
		p("문자열 출력 : " + s );
		p("인덱스[3]의 문자  : " + s.charAt(3)); // 원하는인덱스의 문자를 가져옴.
		p("대문자로 변환 : " + s.toUpperCase()); // 모든 문자를 대문자로 
		p("소문자로 변환 : " + s.toLowerCase()); // 모든 문자를 소문자로
		p("문자열 추출 : " + s.substring(3,7)); // 3포함 7 미포함
		p("문자열 추출 : " + s.substring(6)); // 6부터 문자열 끝까지
		p("문자열의 연결 : " + s.concat("concat")); // 기존 문자열에 다른 문자열 이어 붙이기
		p("앞 뒤 공백 제거 :  abc def x".trim()); // 앞 뒤 공백을 제거 ( id/password 입력받을때 자주 쓰임 )
		p("문자열 변경 : " + s.replace("gR", "ff")); // 문자의 변경 첫번재 매개변수의 문자열을 두번째 매개변수의 값으로 치환
		p("문자열 내용 비교(대소문자 구분 : " + s.equals("abDfAgRe")); // 문자열의 내용 비교 대소문자 구분함
		p("문자열 내용 비교(대소문자 포함) : " + s.equalsIgnoreCase("abdfagre")); // 문자열의 내용 비교 대소문자 구분 안함.
		p("문자열을 문자 배열로 추출 : " + Arrays.toString(s.toCharArray())); // 문자열을 문자 배열로 리턴
		p("문자열의 길이 : " + s.length()); // 문자열의 길이 리턴
		
		String s2 = "고양이/강아지/코끼리/개구리";
		// split는 구분문자열을 정규식으로 입력받기때문에 .(점) , +(플러스) 문자는 정규식으로 입력받아야한다
		// ex) split("\\."), split("\\+")
		System.out.println("문자열 쪼개기 : " + Arrays.toString(s2.split("/"))); // 문자열 쪼개기. 
		
		p("문자열 포함여부 확인 : " + s.contains("fAg")); // 문자열의 포함여부 확인
		p("문자열의 긑이 같은지 : " + s.endsWith("Re")); // 문자열의 끝부분이 매개변수로 넘어온 문자열로 끝났는지 확인 true/false 리턴 (확장자 확인할때 많이씀)
		p("문자열의 시작이 같은지 : " + s.startsWith("ab")); // 문자열의 시작 부분이 매개변수로 넘어온 문자열로 시작했는데 확인 true/false 리턴
		
		
		// 기본형 타입 < - > 문자열 String
		 
		int a = 3;
		boolean b = true;
		
		
//		String.valueOf(..) 다양하게 오버로딩 되어있으니 2개만 확인하고 나머지는
//		직접 실행해보면 될 것같다.
		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(b));
		
		
		String value = "1234";
		
		int valueOfInteger = Integer.parseInt(value);
		System.out.println(valueOfInteger);
		
		valueOfInteger = Integer.valueOf(value);
		System.out.println("권장 변경 방식 : " + valueOfInteger);
		
		
		valueOfInteger = new Integer(value);
		System.out.println("wrapper 사용 : " + valueOfInteger);
		
		
		System.out.println();
		
		String value1 = "3.14";
		
		double valueOfDouble = Double.parseDouble(value1);
		System.out.println(valueOfDouble);
		
		valueOfDouble = Double.valueOf(value1);
		System.out.println("권장 변경 방식 : " + valueOfDouble);
		
		valueOfDouble = new Double(value1);
		System.out.println("wrapper 사용 : " + valueOfDouble);
		
		System.out.println();
		
		
		//문자열에서 문자로바꾸려면 charAt을 써서 할수 있다 . 
		String value2 = "w";
		char valueOfChar = value2.charAt(0);
		System.out.println("charAt 사용 : " + valueOfChar);
		
		
		
		
		
		
		
		
		
		
		
		
	} // end of main
	public static void p(String str){
		System.out.println(str);
	}
} // end of class
