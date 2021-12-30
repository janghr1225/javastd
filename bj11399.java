package javastd1;

import java.util.Scanner;

public class bj11399 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int temp, result = 0;
		int[] arr = new int[1001];	//배열선언방식
		int n = scan.nextInt();
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-(i+1); j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	    
		for(int i=0; i<n; i++) {
			for(int j=0; j<i+1; j++) {
				result = result + arr[j];
			}
		}
		
		System.out.println(result);
		
		scan.close();
	}

}
