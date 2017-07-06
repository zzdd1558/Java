
/**
 * Method 메소드 - 실행문들의 묶음
 *
 */
public class Z06_Method {
	public static void main(String[] args) {
		BBB b1 = new BBB();
		System.out.println(b1.add(7, 3)); // 10
		System.out.println(b1.sub(7, 3)); // 4
		System.out.println(b1.mul(7, 3)); // 21
		System.out.println(b1.div(7, 3)); // 2.33333
		System.out.println(b1.max(7, 3)); // 7
		System.out.println(b1.min(7, 3)); // 3
		System.out.println(b1.abs(-3)); // 절대값 3
		System.out.println(b1.mod(7, 3)); // 1 나눈 나머지

	} // end of main
} // end of class

class BBB {
	//더한값을 리턴
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}
	//뺸 값을 리턴
	public int sub(int a, int b) {
		return a - b;
	}

	//곱한값을 리턴
	public int mul(int a, int b) {
		return a * b;
	}

	//나눈값을 리턴
	public float div(int a, int b) {
		if(b == 0){
			System.out.println("0외에 다른 수를 입력하세요");
			return 0; // try~catch
		}else{
			return ((float)a / b);
		}
	}

	//큰쪽을 리턴
	public int max(int a, int b) {

		return a > b ? a : b;
	}

	
	//작은쪽을 리턴
	public int min(int a, int b) {
		return a > b ? b : a;
	}

	//절대값을 리턴
	public int abs(int a) {
		return a > 0 ? a : -a;
	}

	//mod연산을통해 나머지결과 리턴
	public int mod(int a, int b) {
		return a % b;
	}

}