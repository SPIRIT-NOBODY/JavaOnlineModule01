package module.one.loops;

import java.util.Scanner;

/**
 * Напишите программу, где пользователь вводит любое целое положительное число.
 * А программа суммирует все числа от 1 до введенного пользователем числа
 */

public class Task01 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int x = 1;
		while (x <= 1) {
			System.out.println("Введите целое x > 1");
			if (scanner.hasNextInt()) {
				x = scanner.nextInt();
			} else {
				scanner.nextLine();
			}
		}

		System.out.println("x = " + x);

		long result = 0;
		for (long i = 1; i <= x; i++) {
			result += i;
		}
		System.out.printf("Сумма от 1 до %d = %d", x, result);
	}
}
