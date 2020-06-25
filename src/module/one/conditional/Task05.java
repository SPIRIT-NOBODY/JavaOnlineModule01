package module.one.conditional;

/**
 * Вычислить значение функции: f(x) = x^2 - 3x + 9 , если x <= 3 и 1 / (x^3 +6),
 * если x > 3
 */
public class Task05 {
	public static void main(String[] args) {
		double x = 5;
		System.out.println("Result function for x=" + x + " f=" + resultFunction(x));
	}

	private static double resultFunction(double x) {
		double result;
		if (x <= 3) {
			result = x * x - 3 * x + 9;
		} else {
			result = 1 / (Math.pow(x, 3) + 6);
		}
		return result;
	}
}
