package com.pattern;

import java.util.Scanner;

public class P50Pattern {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Entre the n");
		int n = s.nextInt();
		for (int i = n; i >=1; i--) {
			int x = 1;
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(x + " ");
				if (j < i)
					x++;
				else
					x--;
			}
			System.out.println();
		}
	}

}
