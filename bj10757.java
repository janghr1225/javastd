package javastd1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class bj10757 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(bf.readLine()," ");
		
		//biginteger클래스 선언, 값 입력받기
		//여기서 biginteger는 문자열
		BigInteger a = new BigInteger(st.nextToken());
		BigInteger b = new BigInteger(st.nextToken());
		
		//문자열이기 때문에 더하기 연산 불가
		//따라서 클래스 내부 메서드로 더하기 연산해야함
		BigInteger ab =a.add(b);
		
		System.out.println(ab);
		
	}

}
