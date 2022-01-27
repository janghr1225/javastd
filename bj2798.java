package javastd1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj2798 {

	public static void main(String[] args)  throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		//1. 카드개수, 최대값 입력
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
 
		//2. 카드값 들어갈 배열
		int[] cd = new int[n];
 
		st = new StringTokenizer(br.readLine(), " ");
		
		//3. 카드값 배열에 차례대로 삽입
		for (int i = 0; i < n; i++) {
			cd[i] = Integer.parseInt(st.nextToken());
		}
		
		//4.search함수로 최대값 찾기 실행
		int max = search(cd, n, m);
		
		//5.탐색된 최대값 출력
		System.out.println(max);
		
	}

	static int search(int[] cd, int n, int m) {
		
		int max = 0;	//최종값이 들어갈 변수
 
		//4-1. 1,2,3번째 카드 3개씩 더하면서 
		for (int i = 0; i < n; i++) { 
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					
					int sum = cd[i] + cd[j] + cd[k];
					
					//4-2.m보다 크지 않고 이전까지 더해진 값보다 큰 값 찾기
					if(sum<=m && sum >max) {
						max = sum;
					}
				}
			}
		}
		
		return max;
	}
	
	
}
