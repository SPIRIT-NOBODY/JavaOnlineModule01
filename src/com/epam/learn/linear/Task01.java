package com.epam.learn.linear;

import java.util.Scanner;

/**
 * Найдите значение функции: z = ( (a – 3 ) * b / 2) + c
 **/

class Task01 {

	public static void main(String[] args) {

		Scanner scanner;

		scanner = new Scanner(System.in);

		System.out.println("Введите а");

		while (!scanner.hasNextDouble()) {

			scanner.nextLine();
			System.out.println("Введите а");

		}

		double a;

		a = scanner.nextDouble();

		System.out.println("a = " + a);

		System.out.println("Введите b");

		while (!scanner.hasNextDouble()) {

			scanner.nextLine();
			System.out.println("Введите b");

		}

		double b;

		b = scanner.nextDouble();

		System.out.println("b = " + b);

		System.out.println("Введите c");

		while (!scanner.hasNextDouble()) {

			scanner.nextLine();
			System.out.println("Введите c");

		}

		double c;

		c = scanner.nextDouble();

		System.out.println("c = " + c);

		double result;

		result = compute(a, b, c);

		System.out.println("Rezult function z = " + result);

	}

	private static double compute(double a, double b, double c) {

		return ((a - b) * b / 2) + c;

	}

}