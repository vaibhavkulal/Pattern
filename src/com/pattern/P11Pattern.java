package com.pattern;

import java.util.Scanner;

public class P11Pattern {
	public static void main(String[] args) {
		int a = 1;
		int x=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of (n)");
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++)
//			{
//
//				System.out.print(a + " ");
//				a++;
//				if (a > 9)
//					a = 1;
//			}
			{System.out.print((x%9+1)+" ");
			x++;
			}
			System.out.println();
		}

	}

}
