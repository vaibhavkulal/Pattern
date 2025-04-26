package com.pattern;

import java.util.Scanner;

public class P40Pattern {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the n");
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int k = i; k <= n - 1; k++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= 2*i-1; j++) {
		
				System.out.print(j%2+" ");
			}
			System.out.println();
		}
	}
}
