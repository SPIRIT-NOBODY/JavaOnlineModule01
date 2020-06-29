package module.one.linear;

/**
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и
 * целой частях). Поменять местами дробную и целую части числа и вывести
 * полученное значение числа.
 */

class Task04 {

	public static void main(String[] args) {

		double R;
		double tmpR;
		int firstPart;
		double secondPart;
		double reverse;

		R = 410.001;
		tmpR = R * 1000;
		firstPart = (int) (tmpR / 1000);
		secondPart = (((int) (R * 1000))) - firstPart * 1000;
		reverse = (secondPart * 1000 + firstPart) / 1000;

		System.out.println("Число = " + R);
		System.out.println("перевернутое число = " + reverse);

	}

}