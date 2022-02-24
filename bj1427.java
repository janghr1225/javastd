package javastd1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class bj1427 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] n = br.readLine().toCharArray();
		
		Arrays.sort(n);
		
		for(int i = n.length-1; i>=0; i--) {
			System.out.print(n[i]);
		}
		
	}

}
