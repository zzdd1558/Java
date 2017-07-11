
/**
 * 제어자 활용.
 *
 */
public class Z02_Modifier {
	public static void main(String[] args) {
		Water w1 = Water.getInstance();
		Water w2 = Water.getInstance();
		System.out.println(w1);
		System.out.println(w2);
		System.out.println(w1 == w2);// 주소 값이 같다, 같은 객체이다.
		
	} // end of main
} // end of class



class Water{
    private static Water w = new Water(); // 내부에선 private 생성자에 접근가능
	private Water() { // 나의 클래스 내부에서만 사용가능	
	}
	//Water 객체를 리턴해주는 메서드
	public static Water getInstance(){
		return w;
	}

	
	
}