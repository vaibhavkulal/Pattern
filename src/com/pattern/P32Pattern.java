package com.pattern;

import java.util.Scanner;

public class P32Pattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);	
		System.out.println("Enter the n value");
		int n=s.nextInt();
	

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			
			}
			System.out.println();
		}
	}

}