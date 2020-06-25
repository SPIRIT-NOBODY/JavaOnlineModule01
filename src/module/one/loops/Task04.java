package module.one.loops;

import java.math.BigInteger;

/**
 * Составить программу нахождения произведения квадратов первых двухсот чисел
 */

public class Task04 {
	public static void main(String[] args) {
		BigInteger result = BigInteger.valueOf(1L);
		for (int i = 1; i <= 200; i++) {
			result = result.multiply(BigInteger.valueOf(i * i));
		}
		System.out.printf("result = %d\n", result);
	}
}
