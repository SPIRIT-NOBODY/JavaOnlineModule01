package module.one.linear;

import java.util.Scanner;

/**
 * Вычислить значение выражения по формуле (все переменные принимают
 * действительные значения): ((sin(x) + cos(y)) / (cos(x) - sin(y))) * tg(xy)
 */
class Task03 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите x");
		while (!scanner.hasNextDouble()) {
			scanner.nextLine();
			System.out.println("Введите x");
		}
		double x = scanner.nextDouble();
		System.out.println("x = " + x);

		System.out.println("Введите y");
		while (!scanner.hasNextDouble()) {
			scanner.nextLine();
			System.out.println("Введите y");
		}
		double y = scanner.nextDouble();
		System.out.println("y = " + y);

		double result = compute(x, y);
		System.out.println("Result function = " + result);
	}

	private static double compute(double x, double y) {
		double numerator = Math.sin(x) + Math.cos(y);
		double denominator = Math.cos(x) + Math.sin(y);
		return ((numerator / denominator) * Math.tan(x * y));
	}
}