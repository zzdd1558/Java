
/**
 * @author yunjin
 *  상속(Inheritance) : 부모-자식의 관계를 맺어주는것
 *                     부모클래스의 멤버를 자식클래스에서 물려 받음
 *                     자바에서는 다중상속을 허용하지 않는다.-
 */
public class Z01_Class {
	public static void main(String[] args) {
		Point pp = new Point();
		pp.x = 3 ; pp.y = 6;
		System.out.println(pp.x + " : " + pp.y);
		
		Point3D pp3D = new Point3D();
		pp3D.x = 3; pp3D.y =6 ; pp3D.z = 4;
		System.out.println(pp3D.x + " : " + pp3D.y + " : " + pp3D.z);
	}// end of main
} // end of class


/** 2차원 좌표를 추상화한 클래스 */
class Point {
	int x;
	int y;
}
//상속 : 부모의 모든 멤버(전역변수, 메서드)를 물려받는다. (생성자는 물려받지 않는다.)
//class 자식클래스 extends 상속받을부모클래스
class Point3D extends Point{
	int z;
}


/** 3차원 좌표를 추상화한 클래스*//*
class Point3D{
	int x;
	int y;
	int z;
}*/