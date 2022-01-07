package javastd1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj1085 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int a,b,c;
		
		
		if ((w - x) < x) {
			a = w - x;
		}
		else
			a = x;

		if ((h - y) < y) {
			b = h-y;
		}
		else
			b = y;
		

		if (a < b) {
			c = a;
			System.out.println(c);
		}
		else {
			c = b;
			System.out.println(c);
		}
		
	}

}
