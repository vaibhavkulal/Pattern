package com.pattern;

import java.util.Scanner;

public class P68Pattern {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value");
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || i == j || j + i == n + 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}

			System.out.println();
		}

	}

}
