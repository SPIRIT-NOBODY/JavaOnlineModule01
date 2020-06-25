package module.one.loops;

/**
 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль
 * которых больше или равен заданному е. Общий член ряда имеет вид
 * an = 1/2^n + 1/3^n
 */

public class Task05 {
	public static void main(String[] args) {
		double e = 0.0000051;
		double summ = 0;
		int i = 0;
		double a;
		do {
			a = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));
			if (a >= e) {
				summ += a;
			}
			i++;
		} while (a >= e);
		System.out.println("summ = " + summ);
	}
}
