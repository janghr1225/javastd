package javastd1;

import java.util.Arrays;
import java.util.Scanner;

public class bj1026sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int AB=0;
		int[] arrA = new int[n];
		int[] arrB = new int[n];
		
		//n = scan.nextInt();
		
		for (int i=0; i<n; i++) 
			arrA[i] = scan.nextInt();
		for (int i=0; i<n; i++)
			arrB[i] = scan.nextInt();
		
		scan.close();
		
		Arrays.sort(arrA);
		Arrays.sort(arrB);
		
		
		//배열 곱
		for (int i = 0; i < n; i++) {
			AB += arrA[i] * arrB[n-1-i];
		}

		
		System.out.println(AB);
		
		
	}

}
