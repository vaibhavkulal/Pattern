package com.pattern;

import java.util.Scanner;

public class P34Pattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);	
		System.out.println("Enter the n value");
		int n=s.nextInt();
	int sp=n-1,st=1;

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++) {
				System.out.print("  ");
			}
			
			for(int j=1;j<=st;j++) {
				System.out.print("* ");
			
			}
			sp--;
			st=st+2;
			System.out.println();
		}
	}

}