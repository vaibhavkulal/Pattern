package com.pattern;

import java.util.Scanner;

public class P12Pattern {
	public static void main(String[] args) {
		int a=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of (n)");
		int n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++)
			{
			
				System.out.print((char)(a+64)+" ");
				a++;
				
			}
			System.out.println();
		}

	}

}
