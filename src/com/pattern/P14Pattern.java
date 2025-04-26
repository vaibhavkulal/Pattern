package com.pattern;

import java.util.Scanner;

public class P14Pattern {
	public static void main(String[] args) {
		int a=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of (n)");
		int n=sc.nextInt();
		sc.close();
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=1;j--)
			{
			
				System.out.print((char)(i+64)+" ");
				
				
			}
			System.out.println();   
		}

	}

}
