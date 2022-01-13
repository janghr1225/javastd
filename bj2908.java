package javastd1;

import java.util.Scanner;

public class bj2908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		n1 = Integer.parseInt(new StringBuilder().append(n1).reverse().toString());
		n2 = Integer.parseInt(new StringBuilder().append(n2).reverse().toString());
		//문자열 반전을 위해 StringBuilder클래스의 reverse()메서드를 사용한다.
		//reverse()로 문자열 반전 후 
		//toString()메서드로 StringBuiller 타입인 값을 문자열 객체를 가져온다.
		//n1,n2는 int이므로 문자열로 가져온 값을 Integer.parseInt()로 타입을 변경한다.
		
		if(n1>n2) 
			System.out.println(n1);
		else
			System.out.println(n2);
		
		
		sc.close();
		
	}

}
