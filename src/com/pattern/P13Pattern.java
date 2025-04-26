package com.pattern;

import java.util.Scanner;

public class P13Pattern {
	public static void main(String[] args) {
		int a=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of (n)");
		int n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=1;j--)
			{
			
				System.out.print((char)(j+96)+" ");
				
				
			}
			System.out.println();
		}

	}

}
