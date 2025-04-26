package com.pattern;

import java.util.Scanner;

public class P47Pattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Entre the n");
		int n=s.nextInt();
		int sp=n-1,st=1;
		for(int i=1;i<=n;i++) {
			int x=i;
			for(int j=1;j<=sp;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=st;j++) {
				System.out.print(x+" ");
				if(j<=st/2)
					x--;
				else
					x++;
			}
			sp--;
			st=st+2;
			System.out.println();
		}
	}

}
