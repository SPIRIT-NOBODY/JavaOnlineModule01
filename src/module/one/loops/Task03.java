package module.one.loops;

/**
 * Найти сумму квадратов первых ста чисел
 */

public class Task03 {

	public static void main(String[] args) {

		int result;
		result = 0;
		
		for (int i = 0; i < 100; i++) {
			
			result += i * i;
		}

		System.out.printf("Сумма квадратов первых ста чисел = %d", result);

	}

}
