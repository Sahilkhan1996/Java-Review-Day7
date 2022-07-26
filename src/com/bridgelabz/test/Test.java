package com.bridgelabz.test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("Please Enter Any Alphabet: ");
		Scanner sc = new Scanner(System.in);
		char me = sc.next().charAt(0);
		int i = 0;

		while ((me == 'a' || me == 'e' || me == 'i' || me == 'o' || me == 'u') && (i < 1)) {
			System.out.println("The entered alphabet is vowel");
			i++;
		}
		while ((me != 'a' || me != 'e' || me != 'i' || me != 'o' || me != 'u') && (i < 1)) {
			System.out.println("The entered alphabet is consonent");
			i++;
		}

		sc.close();
	}
}
