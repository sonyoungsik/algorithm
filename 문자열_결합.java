package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		while (true) {

			Scanner sc = new Scanner(System.in);

			int n = sc.nextInt();
			String[] strs = new String[n];

			for (int i = 0; i < n; i++) {
				strs[i] = sc.next();
			}

			System.out.print("Hello ");

			for (int i = 0; i < n; i++) {
				if (i != strs.length - 1) {
					System.out.print(strs[i] + ",");
				} else {
					System.out.print(strs[i] + ".");
				}
			}
			System.out.printf("\n\n");
		}
	}
}
