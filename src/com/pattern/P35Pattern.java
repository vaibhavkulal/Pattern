package com.pattern;

import java.util.Scanner;

public class P35Pattern {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the n");
		int n = s.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int k = i; k <= n - 1; k++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
		
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
