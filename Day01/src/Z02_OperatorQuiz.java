public class Z02_OperatorQuiz {
	public static void main(String[] args) {
//		사과가 존재한다
//		사과는 그릇위에 놓아야 하고, 그릇1개에는 10개씩 담을 수 있다.
		int size = 10;
		int numOfApple = 123;
		int num = numOfApple / 10 + (numOfApple % size == 0 ? 0 : 1);
		System.out.println("그릇의 갯수 : " + num + "개 입니다");
	} // end of main
} // end of main
