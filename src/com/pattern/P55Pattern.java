package com.pattern;

import java.util.Scanner;

public class P55Pattern {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int sp=0,st=n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=st;j++){
				System.out.print("* ");
				
			}
			if(i<=n/2)
			{
				sp++;
				st=st-2;
			}
			else
			{
			
				sp--;
				st=st+2;
			}
			System.out.println();
		}

	}

}
