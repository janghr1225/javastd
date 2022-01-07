package javastd1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

///////////stringtokenizer, bufferedreader 오류 잡기/////////

public class bj3009 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int[] x = new int[4];
		int[] y = new int[4];
		
		/*
		for(int i=0; i<3; i++) {			
			//x[i] = Integer.parseInt(br.readLine());
			//StringTokenizer st = new StringTokenizer(br.readLine()," ");
			//y[i]= Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine()," ");
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
			
		}
		*/
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine()," ");
		x[0] = Integer.parseInt(st.nextToken());
		y[0] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine()," ");
		x[1] = Integer.parseInt(st.nextToken());
		y[1] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine()," ");
		x[2] = Integer.parseInt(st.nextToken());
		y[2] = Integer.parseInt(st.nextToken());
		
		
		if (x[0] == x[1]) x[3] = x[2];		
		else if (x[0] == x[2]) x[3] = x[1];	
		else x[3] = x[0];					
		//첫좌표x값이 두번째좌표x값과 같은 경우 출력되어야할 x좌표값은 3번째좌표x값과 같아야 함


		if (y[0] == y[1]) y[3] = y[2];
		else if (y[0] == y[2]) y[3] = y[1];
		else y[3] = y[0];
		//첫좌표y값이 두번째좌표 y값y[1]과 같은 경우 출력되어야할 y좌표값은 3번째좌표 y값y[2]과 같아야 함
		
		System.out.println(x[3] + " " + y[3]);
		
		br.close();
	}

}
