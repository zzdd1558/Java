
public class Quiz {
	public static void main(String[] args) {
		char sqare[][] = new char[10][10];
		
		for (int i = 0; i < sqare.length; i++) {
			for (int j = 0; j < sqare[i].length; j++) {
				sqare[i][j] = '■';
				System.out.print(sqare[i][j]);
			}
			System.out.println();
		}
	}
}
