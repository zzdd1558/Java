/**
 * 
 * 인터페이스
 * 		클래스의 최고 조상 클래스는 Object
 * 		인터페이스는 최고 조상이 없다.
 *
 */
public class Z05_Interface2 {
	public static void main(String[] args) {
		
	} // end of main
} // end of class

//  클래스 상속 간에는 extends로 상속 ( 단일 상속만 허용 : 애매모호한 오류가 나기 때문)
 	class AA{}
	class BBBBB extends AA{} 

interface Cable{}
interface Dable extends Cable{} // 상속 가능
interface Eable{}
interface Fable{}
interface Gable extends Eable , Fable{} // 인터페이스는 다중상속을 허용


interface Xable{}
class X implements Xable, Fable, Eable{}  // 구현도 다중구현 가능.



class Y{}
class Z extends Y implements Eable{} // 순서는 extends가 implement보다 앞에 와야 한다. ( 상속 후 구현 )