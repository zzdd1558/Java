import javax.swing.JOptionPane;

/**
 * @author yunjin
 * 사용자의 입력 받기3 : JOptionPane
 */
public class Z05_Input3 {
	public static void main(String[] args) {
		//문자열 String 로만 입력 가능.
		String name = JOptionPane.showInputDialog("당신의 이름은 : ");
		System.out.println(name);
		
		String age = JOptionPane.showInputDialog("당신의 나이는 : ");
		System.out.println("당신의 현재 나이는 : " + Integer.valueOf(age) + "살 입니다2");
		System.out.println("10년후의 나이는 : " + (Integer.valueOf(age) + 10) + "살 입니다.");
		
		
	}// end of main
	
}//end of class