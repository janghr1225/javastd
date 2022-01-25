package javastd1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj7568 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());	//사람 수 입력
		int[][] arr = new int[N][2];	//2차원 배열로 몸무게, 키 저장
 
		String[] sp;
		
		for(int i = 0; i < N; i++) {
			sp = br.readLine().split(" ");			//몸무게와 키 문자 분리 구분자
			arr[i][0] = Integer.parseInt(sp[0]);	//2차원 배열 첫번째 몸무게 입력
			arr[i][1] = Integer.parseInt(sp[1]);	//2차원 배열 두번째 키 입력
		}
		//순서대로 비교
		for(int i = 0; i < N; i++) {
			int rank = 1;
			for(int j = 0; j < N; j++) {
				//if(i == j) continue;
				//값이 더 큰 비교값이 있을 경우 순위 뒤로 밀림
				if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					rank++;
				}
			}
			System.out.print(rank + " ");
		}
	}
}
