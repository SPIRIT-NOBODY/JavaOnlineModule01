package module.one.loops;

/**
 * Составить программу нахождения произведения квадратов первых двухсот чисел
 */

public class Task04 {
	public static void main(String[] args) {

		long result;
		result = 1L;

		for (long i = 1; i <= 200; i++) {

			long tmpResult;
			tmpResult = result * i;

			if (tmpResult < result) {

				System.out.println("Превышено максимальное значение на i = " + i);
				break;

			}

			result = tmpResult;

		}

		System.out.printf("result = %d\n", result);
	}
}
