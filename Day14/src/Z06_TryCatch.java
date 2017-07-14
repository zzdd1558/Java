
public class Z06_TryCatch {
	public static void main(String[] args) {
		System.out.println(add(7,3));
		System.out.println(max(7,3));
		try {
			System.out.println(div(7,0));
		} catch (MyException e) {
			// TODO Auto-generated catch block
			System.out.println("0으로 나눌수 없습니다.");
		}
		System.out.println(abs(-3));
	} // end of main

	static int abs(int a) {
		// TODO Auto-generated method stub
		return a < 0 ? -a : a;
	}

	static int div(int a, int b) throws MyException{
		// TODO Auto-generated method stub
		
		if( b== 0){
			throw new MyException();
		}
		return a/b;
	}

	static int max(int a, int b) {
		// TODO Auto-generated method stub
		return (a > b ? a : b);
	}

	static int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
	
}// end of class




class MyException extends Exception{
	
}
