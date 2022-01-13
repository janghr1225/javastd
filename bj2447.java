package javastd1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class bj2447 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		int i,j;
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		for(i=0; i<n; i++) {
			for(j=0;j<n; j++) {
				starstemp(i,j,n);
			}
			System.out.println('\n');
		}
		
		
	}
	
	static void starstemp(int i, int j, int n) {
		if((i/n)%3==1 && (j/n)%3==1) {
			System.out.println(" ");
		}
		else {
			if(n/3==0) {
				System.out.println("*");
			}
			else {
				starstemp(i,j,n/3);
			}
		}
		
	}

}
