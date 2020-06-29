package module.one.linear;

/**
 * Вычислить значение выражения по формуле (все переменные принимают
 * действительные значения): (b + sqrt(b^2 + 4ac))/(2a) - a^3*c + b^(-2)
 */

class Task02 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;

		a = 1.5;
		b = 11.5;
		c = 123;

		System.out.println("Result function = " + compute(a, b, c));

	}

	private static double compute(double a, double b, double c) {

		double numerator;

		numerator = b + Math.sqrt(b * b + 4 * a * c);
		numerator = (numerator / (2 * a) - (a * a * a) * c + 1 / (b * b));

		return numerator;

	}

}