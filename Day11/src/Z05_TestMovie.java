
public class Z05_TestMovie {
	public static void main(String[] args) {
		
	} // end of main	
} // end of class



class Movie{
	private String title = "";
	private String type  = "";
	private int grade;
	private int viewCount;
	
	
	//출력을 위한 메서드
	void print(){ 
		System.out.println("title : " + title + " type :  " + type + " grade : " + grade + " viewCount : " + viewCount);
	}
	
	
	//기본 생성자
	public Movie() {
		// TODO Auto-generated constructor stub
	}
	
	// title, type , grade , viewCount 를 매개변수로 받는 생성자.
	public Movie(String title, String type, int grade, int viewCount) {
		super();
		this.title = title;
		this.type = type;
		this.grade = grade;
		this.viewCount = viewCount;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getViewCount() {
		return viewCount;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	
	
	
	
}
