package com.pattern;

import java.util.Scanner;

public class P07Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of (n)");
		int n=sc.nextInt();
		sc.close();
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
