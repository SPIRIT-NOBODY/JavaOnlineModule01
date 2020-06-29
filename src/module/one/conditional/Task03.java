package module.one.conditional;

/**
 * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они
 * расположены на одной прямой
 */

public class Task03 {

	public static void main(String[] args) {

		double x1;
		double y1;
		double x2;
		double y2;
		double x3;
		double y3;

		x1 = 5;
		y1 = 3.5;
		x2 = 2.5;
		y2 = 2.5;
		x3 = 5.5;
		y3 = 6.5;

		double result;

		result = (x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1);

		String resultText = (result == 0 ? "Точки лежат на одно прямой" : "Точки не лежат на одно прямой");

		System.out.println(resultText);
	}
	
}
