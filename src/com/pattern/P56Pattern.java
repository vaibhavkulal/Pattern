package com.pattern;

import java.util.Scanner;

public class P56Pattern {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the n");
		int n = s.nextInt();
		int sp = n / 2, st = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= st; j++) {

				System.out.print(j + " ");
				if (j < st)
					System.out.print("* ");

			}
			if (i <= n / 2) {
				sp--;
				st++;
			} else {

				sp++;
				st--;
			}

			System.out.println();
		}

	}
}
