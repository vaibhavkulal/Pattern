package com.pattern;

import java.util.Scanner;

public class P38Pattern {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the n");
		int n = s.nextInt();

		for (int i = n; i >=1; i--) {
			int x=i;
			for (int k = 1; k <=n-i; k++) {
				System.out.print("  ");
			}
			for (int j = 1; j<=i; j++) {
		
				System.out.print(x+" ");
				x--;
			}
			System.out.println();
		}
	}
}
