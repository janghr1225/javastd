package javastd1;

import java.io.BufferedReader;
import java.util.Arrays; 
import java.io.InputStreamReader;
import java.io.IOException;


public class bj2217 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());		// 로프 개수
		int kw=0;	// 최대 중량
		int [] w = new int[n];		//로프마다의 중량 저장할 배열 선언
		
		for(int i=0; i<n; i++) {
			w[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(w);		//중량을 오름차순 정렬
		
		for (int i = 0; i < n; i++) {		
			if (kw < w[i] * (n - i))		//현재 i로프의 최대 중량 * 현재 로프 수
				kw = w[i] * (n - i);
		}
		
		System.out.println(kw); 	//최대 중량 출력
	}

}
