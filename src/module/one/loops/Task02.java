package module.one.loops;

/**
 * Вычислить значения функции на отрезке [а,b] c шагом h:
 * y = x, x>2 и y = -x, x <=2
 */

public class Task02 {
	public static void main(String[] args) {
		double a = -1.0;
		double b = 5;
		double h = 0.1;
		int index = 0;
		for (double x = a; x <= b; x += h) {
			System.out.printf("%d: f(%f) = %f  \n", index++, x, f(x));
		}
	}

	private static double f(double x) {
		return (x <= 2 ? -x : x);
	}
}
