import java.util.Scanner;

public class Z01_Team {
	public static void main(String[] args) {
		// int a[] = { 1, 2, 3, 4 };
		// String name[] = { "최윤진", "김정규", "임대호", "김창욱" };
		// int age[] = { 25, 30, 36, 25 };

		// Man m1 = new Man();
		// m1.name = "최윤진";
		// m1.age = 25;
		//
		// Man m2 = new Man();
		// m1.name = "김정규";
		// m1.age = 30;
		//
		// Man m3 = new Man();
		// m1.name = "임대호";
		// m1.age = 36;
		//
		// Man m4 = new Man();
		// m1.name = "김창욱";
		// m1.age = 25;
		//
		Scanner scan = new Scanner(System.in);
		Man m[] = new Man[4];

		for (int i = 0; i < m.length; i++) {
			m[i] = new Man();
		}
		m[0].name = "최윤진";
		m[0].age = 25;
		m[1].name = "김정규";
		m[1].age = 30;
		m[2].name = "임대호";
		m[2].age = 36;
		m[3].name = "김창욱";
		m[3].age = 25;

		int index = 0;
		while (true) {
			System.out.println(m[index].name);
			System.out.println(m[index].age);
			scan.nextLine();
			if (index < m.length - 1) {
				index++;
			} else {
				index = 0;
			}
		}

	}
}

/** 한사람의 이름과 , 나이를 관리할 클래스 */
class Man {

	/** 이름 */
	String name;
	/** 나이 */
	int age;
}