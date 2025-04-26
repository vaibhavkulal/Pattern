package com.pattern;

import java.util.Scanner;

public class P65Pattern {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Value");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			int x=1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(x+"   ");
				x=x*(i-j)/j;
			}
			System.out.println();
		}
	}
}
