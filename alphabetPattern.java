package com.controller;

import java.util.Scanner;

public class alphabetPattern  {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input word ");
		String input = scanner.nextLine();
		char[] charInput = input.toCharArray();

		int m = charInput.length / 2;
		for (int i = 1; i <= charInput.length; i++) {
			int n = charInput.length / 2;
			int index = 0;
			for(int k = 1; k <=charInput.length-i; k++) {
				System.out.print(" ");
			}
			for (int j = i; j > 0; j--) {
				if (n < charInput.length) {

					System.out.print(charInput[n]);

					n++;
				} else if (n >= charInput.length && index < m) {
					System.out.print(charInput[index]);
					index++;

				}

			}
			System.out.println("\n");
		}

	}

}