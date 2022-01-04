package javastd1;

import java.util.Scanner;

public class bj5585 {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int one = 1000;
	int left=0;
	int cnt=0;
	
	int pay = sc.nextInt();
	
	left = one - pay;
	
	while(left != 0) {
		if (left >= 500) {
			left -= 500;
			cnt++;
		}
		else if (left >= 100) {
			left -= 100;
			cnt++;
		}
		else if (left >= 50) {
			left -= 50;
			cnt++;
		}
		else if (left >= 10) {
			left -= 10;
			cnt++;
		}
		else if (left >= 5) {
			left -= 5;
			cnt++;
		}
		else {
			left -= 1;
			cnt++;
		}
	}
	
	
	System.out.println(cnt);
	sc.close();
	
	}
}
