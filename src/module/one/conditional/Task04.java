package module.one.conditional;

/**
 * Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
 * Определить, пройдет ли кирпич через отверстие.
 */

public class Task04 {
	public static void main(String[] args) {

		double a = 50;
		double b = 30;
		double x = 29;
		double y = 45;
		double z = 60.5;

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
