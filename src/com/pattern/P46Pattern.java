package com.pattern;

import java.util.Scanner;

public class P46Pattern {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the n");
		int n = s.nextInt();
		int sp = n - 1, st = 1;
		for (int i = 1; i <= n; i++) {

			for (int k = 1; k <= sp; k++) {
				System.out.print("  ");
			}
			int x = 1;
			for (int j = 1; j <= st; j++) {

				System.out.print(x + " ");
				if (j <= st / 2)
					x++;
				else
					x--;
			}
			sp--;
			st = st + 2;
			System.out.println();
		}
	}

}
