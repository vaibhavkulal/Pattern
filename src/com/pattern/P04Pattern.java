package com.pattern;

import java.util.Scanner;

public class P04Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of (n)");
		int n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++)
			{
				System.out.print(j%2+" ");
			}
			System.out.println();
		}

	}

}
