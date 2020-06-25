package module.one.loops;

import java.util.Arrays;

/**
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго
 * числа.
 */

public class Task08 {

	public static void main(String[] args) {
		int first = -918130;
		int second = 103003800;
		checkDigitsInNumbers(first, second);
	}

	private static void checkDigitsInNumbers(int x, int y) {
		int[] digX = getDigitalFromNumber(x);
		int[] digY = getDigitalFromNumber(y);
		int[] digitals = alignmentDigitals(digX, digY);
		System.out.println("Цифры которые входят в состав и " + x + ", и " + y);
		for (int i = 0; i < digitals.length; i++) {
			System.out.print(digitals[i] + " ");
		}

	}

	private static int[] getDigitalFromNumber(int number) {
		int tmpNumber = number < 0 ? number * (-1) : number;
		int[] digitsNumber = new int[Integer.toString(tmpNumber).length()];
		for (int i = 0; i < digitsNumber.length; i++) {
			digitsNumber[i] = tmpNumber % 10;
			tmpNumber = tmpNumber / 10;
		}
		Arrays.sort(digitsNumber);
		return digitsNumber;
	}

	private static boolean inArray(int[] arr, int search) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				return true;
			}
		}
		return false;
	}

	private static int[] alignmentDigitals(int[] first, int[] second) {
		int[] digits = new int[1];
		digits[0] = -1;
		for (int i = 0; i < first.length; i++) {
			if (inArray(second, first[i]) && !inArray(digits, first[i])) {
				digits[digits.length - 1] = first[i];
				if (i + 1 != first.length && (i + 1 < first.length && inArray(second, first[i + 1]))) {
					digits = Arrays.copyOf(digits, digits.length + 1);
				}
			}
		}
		return digits;
	}
}
