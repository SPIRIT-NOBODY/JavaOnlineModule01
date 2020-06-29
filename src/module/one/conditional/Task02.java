package module.one.conditional;

/**
 * Найти max{min(a, b), min(c, d)}
 */

public class Task02 {
	
	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		double d;

		a = 10;
		b = 20;
		c = 25;
		d = 5;

		System.out.println(max(min(a, b), max(c, d)));
		
	}

	private static double min(double a, double b) {
		
		return a < b ? a : b;
		
	}

	private static double max(double a, double b) {
		
		return a > b ? a : b;
		
	}
}
