import java.util.HashSet;
import java.util.Random;

public class Z02_Lotto {
	public static void main(String[] args) {
		
		Random ran = new Random();
//		무작위 난수 발생  Math.random() Random() 클래스
//		Math.random() 0보다 크거나 같고 1보다 작은 double 를 반환
		
		
				
//		System.out.println(ran.nextInt(44)+1);
		
		
//		로또 번호 7개 출력하기
		/*int lotto[] = new int[7];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] =  ran.nextInt(44)+1;
			for (int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]){
					i--;
					break;
				}
			}
		}
		
		//카운팅 정렬 사용
		int cnt[] = new int[45];//로또 번호가 45개이기떄문에.
		for (int i = 0; i < lotto.length; i++) {
			cnt[lotto[i]]++;
		}
		for (int i = 0; i < cnt.length; i++) {
			for (int j = 0; j < cnt[i]; j++) {
				System.out.print(i + " ");
			}
		}
		*/System.out.println();
		
		
		
		
		//순서 섞기 shuffle
		/*
		int n[] = new int[45];
		
		
		// n에 1~45까지 초기화
		for (int i = 0; i < n.length; i++) {
			n[i] = i+1;
		}
		
		//1~45까지의 수를 무작위로 섞어서 앞쪽 7개만 출력
		for (int i = 0; i < n.length * 4; i++) { // 최소 2배수 이상
			int r = ran.nextInt(n.length);
			int temp = n[0];
			n[0] = n[r];
			n[r] =temp;
		}
		
		for (int i = 0; i < 7; i++) {
			System.out.print(n[i] + " ");
		}*/
		
		
		
		
		
//		 자바에서 자료구조 
//		List: 배열과 유사 , 순서 존재 
//		Set : 순서 없음, 중복 불가
//		Map : 키 , 값
		
		HashSet<Integer> hash = new HashSet<Integer>();
		
		while(hash.size()<  7){
			hash.add(ran.nextInt(45)+1);
		}
		System.out.println(hash);
		
		
		
		
		
	} // end of main
} // end of class
