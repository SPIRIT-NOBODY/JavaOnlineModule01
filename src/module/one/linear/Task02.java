package module.one.linear;

import java.util.Scanner;

/**
 * Вычислить значение выражения по формуле (все переменные принимают
 * действительные значения): (b + sqrt(b^2 + 4ac))/(2a) - a^3*c + b^(-2)
 */
class Task02 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите а");
		while (!scanner.hasNextDouble()) {
			scanner.nextLine();
			System.out.println("Введите а");
		}
		double a = scanner.nextDouble();
		System.out.println("a = " + a);

		System.out.println("Введите b");
		while (!scanner.hasNextDouble()) {
			scanner.nextLine();
			System.out.println("Введите b");
		}
		double b = scanner.nextDouble();
		System.out.println("b = " + b);

		System.out.println("Введите c");
		while (!scanner.hasNextDouble()) {
			scanner.nextLine();
			System.out.println("Введите c");
		}
		double c = scanner.nextDouble();
		System.out.println("c = " + c);

		double result = compute(a, b, c);
		System.out.println("Result function = " + result);
	}

	private static double compute(double a, double b, double c) {
		double numerator = b + Math.sqrt(b * b + 4 * a * c);
		numerator = (numerator / (2 * a) - Math.pow(a, 3) * c + 1 / (b * b));
		return numerator;
	}
}