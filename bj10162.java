package javastd1;

import java.util.Scanner;

public class bj10162 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int cnta,cntb,cntc;
		
		if (t % 10 != 0) 
			System.out.println("-1\n");

		else {
			cnta = t / 300;
			t = t % 300;

			cntb = t / 60;
			t = t % 60;

			cntc = t / 10;
			
			System.out.println(cnta +" " + cntb +" " + cntc);
		}
		
		sc.close();
	}

}
