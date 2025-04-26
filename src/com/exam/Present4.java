package com.exam;

import java.util.Scanner;

public class Present4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		int sp = n - 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("  ");

			}
			for (int j = 1; j <= n; j++) {
				System.out.print("* ");
			}

			sp--;
			System.out.println();
		}

	}

}
