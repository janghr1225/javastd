package javastd1;

import java.util.Scanner;

public class bj1026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int[] arrA = new int[50];
		int[] arrB = new int[50];
		int n,i,j,temp,AB = 0;
		
		n = scan.nextInt();
		
		for (i=0; i<n; i++) 
			arrA[i] = scan.nextInt();
		for (i=0; i<n; i++)
			arrB[i] = scan.nextInt();
		
		//배열A 내림차순 정렬
		for (i = 0; i < n-1; i++) {
			for (j = 0; j < n - (1 + i); j++) {
				if (arrA[j] < arrA[j + 1]) {
					temp = arrA[j];
					arrA[j] = arrA[j + 1];
					arrA[j + 1] = temp;
				}
			}
		}

		//배열B 오름차순 정렬
		for (i = 0; i < n - 1; i++) {
			for (j = 0; j < n - (1 + i); j++) {
				if (arrB[j] > arrB[j + 1]) {
					temp = arrB[j];
					arrB[j] = arrB[j + 1];
					arrB[j + 1] = temp;
				}
			}
		}

		
		
		//배열 곱
		for (i = 0; i < n; i++) {
			AB += arrA[i] * arrB[i];
		}

		
		System.out.println(AB);
		
		scan.close();
		
	}

}
