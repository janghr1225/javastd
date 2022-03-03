package javastd1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj2864 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//1.두 수 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		//2.replace함수로 6을 5로 문자열 치환해서 최소값 만들기
		String a = st.nextToken().replace('6', '5');
		String b = st.nextToken().replace('6', '5');
		//3.최소값 출력
		System.out.print(Integer.parseInt(a) + Integer.parseInt(b)+" ");
		//4.replace함수로 5를 6으로 치환해서 최대값 만들기
		a = a.replace('5', '6');
		b = b.replace('5', '6');
		//5.최대값 출력
		System.out.print(Integer.parseInt(a)+Integer.parseInt(b));
		
		
	}

}
