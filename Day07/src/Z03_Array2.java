import java.util.Arrays;

public class Z03_Array2 {
	public static void main(String[] args) {
		int a[] = {1,2,3,4};
		int b[] = new int[a.length];
		
		// 얕은 복사 - 객체의 주소를 복사 , 같은 대상을 참조한다.
		b = a;
		
		System.out.println("a : " + Arrays.toString(a));
		System.out.println("b : " + Arrays.toString(b));
		
		b[2] = 100;
		
		System.out.println("a : " + Arrays.toString(a));
		System.out.println("b : " + Arrays.toString(b));
		
		
		int c[] = {3,4,5,6};
		int d[] = new int[c.length]; //c배열을 복사할 배열
		
		
		//깊은 복사 : 객체 자체를 별개의 대상으로 복사.
		for (int i = 0; i < c.length; i++) {
			d[i] = c[i];
		}
		
		d[2] = 50;
		System.out.println("c : " + Arrays.toString(c));
		System.out.println("d : " + Arrays.toString(d));
		
		
		
		int e[] = {3,4,5,6};
		int f[] = new int[e.length];
		
		System.arraycopy(e, 0, f, 0, e.length);
		
		System.out.println("e : " + Arrays.toString(e));
		System.out.println("f : " + Arrays.toString(f));
		
		f[2] = 100;
		System.out.println("e : " + Arrays.toString(e));
		System.out.println("f : " + Arrays.toString(f));
		
		
	}
}
