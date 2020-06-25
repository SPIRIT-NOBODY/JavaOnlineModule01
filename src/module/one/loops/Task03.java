package module.one.loops;

/**
 * Найти сумму квадратов первых ста чисел
 */

public class Task03 {
	public static void main(String[] args) {
		long result = 0;
		for (int i = 1; i <= 100; i++) {
			result += i * i;
		}
		System.out.printf("result = %d", result);
	}
}
