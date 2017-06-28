import javax.swing.JOptionPane;

public class Z05_Input3Quiz {
	public static void main(String[] args) {
//		사용자로부터 년도를 입력받아 윤년인지 아닌지 출력
		String year = JOptionPane.showInputDialog("년을 입력하세요");
		int integerYear = Integer.valueOf(year);
		if(integerYear % 400 == 0){
			System.out.println("윤년");
		}else if (integerYear % 100 == 0){
			System.out.println("평년");
		}else if(integerYear % 4 == 0){
			System.out.println("윤년");
		}else{
			System.out.println("평년");
		}
		
	} // end of main
} // end of class
