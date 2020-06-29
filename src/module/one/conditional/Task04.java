package module.one.conditional;

/**
 * Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
 * Определить, пройдет ли кирпич через отверстие.
 */

public class Task04 {

	public static void main(String[] args) {

		double a;
		double b;
		double x;
		double y;
		double z;

		a = 50;
		b = 30;
		x = 29;
		y = 45;
		z = 60.5;

		if (testSide(x, y, a, b) || testSide(x, z, a, b) || testSide(y, z, a, b)) {

			System.out.println("Кирпич проходит");

		} else {

			System.out.println("Кирпич не проходит");

		}

	}

	private static boolean testSide(double x, double y, double a, double b) {

		return ((x <= a && y <= b) || (x <= b && y <= a));

	}
}
