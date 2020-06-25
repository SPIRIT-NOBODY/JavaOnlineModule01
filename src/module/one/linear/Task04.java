package module.one.linear;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и
 * целой частях). Поменять местами дробную и целую части числа и вывести
 * полученное значение числа.
 */
class Task04 {

	public static void main(String[] args) {
		double R = 850.001;
		// variant 1
		double tmpR = R * 1000;
		int firstPart = (int) (tmpR / 1000);
		double secondPart = (((int) (R * 1000))) - firstPart * 1000;
		double reverse = (secondPart * 1000 + firstPart) / 1000;
		System.out.println("Число = " + R);
		System.out.println("перевернутое число = " + reverse);
		// variant 2
		BigDecimal bd = new BigDecimal(R, MathContext.DECIMAL64);
		BigDecimal secondPartBd = bd.remainder(new BigDecimal(1), MathContext.DECIMAL64).setScale(3, RoundingMode.DOWN);
		BigDecimal firstPartBd = bd.divide(new BigDecimal(1), MathContext.DECIMAL64).setScale(0, RoundingMode.DOWN);
		BigDecimal reverseBd = secondPartBd.movePointRight(3).add(firstPartBd.movePointLeft(3)).setScale(3,
				RoundingMode.DOWN);
		System.out.println("reverseBigDecimal = " + reverseBd);
	}
}