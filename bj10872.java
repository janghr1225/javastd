package javastd1;

import java.util.Scanner;

public class bj10872 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(fact(n));
		
		
	}
	
	static int fact(int n) {
		if(n>1)
			return n*fact(n-1);
		else
			return 1;
		
	}

}
