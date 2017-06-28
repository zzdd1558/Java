import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Z03_Input1Quiz {
	public static void main(String[] args) throws IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
//		사용자에게 숫자를 3개를 입력받아서 , 최대값을 출력
		
		int numOfFirst, numOfSecond, numOfThird,MAX;
		
		System.out.print("첫번째 수 : ");
		numOfFirst = Integer.valueOf(buffer.readLine());
		System.out.print("두번째 수 : ");
		numOfSecond = Integer.valueOf(buffer.readLine());
		System.out.print("세번째 수 : ");
		numOfThird = Integer.valueOf(buffer.readLine());
		
		MAX = numOfFirst;
		
		if(MAX<numOfSecond){
			MAX = numOfSecond;
		}
		if(MAX<numOfThird){
			MAX = numOfThird;
		}
		System.out.println("제일 큰수 : " + MAX);
		
	}
}