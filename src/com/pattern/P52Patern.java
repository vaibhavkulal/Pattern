package com.pattern;

import java.util.Scanner;

public class P52Patern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the n");
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			
			for (int k = i; k <= n - 1; k++) {
				System.out.print("  ");
			}
			int x=n-i+1;
			for (int j = 1; j <= 2 * i - 1; j++) {

				System.out.print(x + " ");
				if(j<i)
					x++;
				else
					x--;
			}
			System.out.println();
		}
	}
}
