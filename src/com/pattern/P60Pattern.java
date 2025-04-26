package com.pattern;

import java.util.Scanner;

public class P60Pattern {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the n");
		int n = s.nextInt();
		int sp = 0;
		for (int i = 1; i <= n; i++) {
			int st = 1;
			if (i <= n / 2+1) {
				sp++;
				st =i;
			} else {
				sp--;
				st =n-i+1;
			}


			for (int j = 1; j <= sp; j++) {
				System.out.print("  ");
			}

			for (int j = st; j <= n / 2 + 1; j++) {
				System.out.print(j+" ");
			}

			
			for (int j = n / 2; j >= st; j--) {
				System.out.print(j+" ");
			}

			

			System.out.println();
		}

	}

}
