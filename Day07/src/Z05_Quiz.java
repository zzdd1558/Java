
public class Z05_Quiz {
	public static void main(String[] args) {
		
		int block[] = {7,4,2,0,0,6,0,7,0};
		int maxGap = 0; // 가장 작은 값 초기화
		for(int i = 0; i< block.length; i++){
			int gap = 0; // 현재 i번째의 낙차
			for (int j = i+1; j < block.length; j++) {
				//나보다 작은 값으 개수를 센다.
				if(block[i] > block[j]){
					gap++;
				}
			}
			if(maxGap < gap) {
				maxGap = gap;
			}
		}
		System.out.println(maxGap);
	
		
	}
}
