package com.pattern;

import java.util.Scanner;

public class P57Pattern {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the n");
		int n = s.nextInt();
		int sp = n / 2, st = 1;
		for (int i = 1; i <= n; i++) {
			int x = st/2+1;
			for (int j = 1; j <= sp; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= st; j++) {

				System.out.print(x + " ");
				
				if (j <= st / 2)
					x--;
				else
					x++;
			}
			if (i <= n / 2) {
				sp--;
				st = st + 2;
			} else {

				sp++;
				st = st - 2;
			}

			System.out.println();
		}

	}
}
