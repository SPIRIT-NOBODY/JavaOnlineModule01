package com.epam.learn.loops;

import java.util.Arrays;

/**
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго
 * числа.
 */

public class Task08 {

	public static void main(String[] args) {

		int first;
		int second;

		first = -103456789;
		second = 987000021;

		checkDigitsInNumbers(first, second);
	}

	/**
	 * Выводит в консоль цифры, входищие как в первое число, так и во второе число
	 * 
	 * @param x
	 * @param y
	 * @return void;
	 */

	private static void checkDigitsInNumbers(int x, int y) {

		int[] digX;
		int[] digY;
		int[] comparedDigitals;

		digX = getDigitalFromNumber(x);
		digY = getDigitalFromNumber(y);
		comparedDigitals = alignmentDigitals(digX, digY);

		System.out.println("Цифры которые входят в состав и " + x + ", и " + y);

		for (int i = 0; i < comparedDigitals.length; i++) {

			System.out.print(comparedDigitals[i] + " ");

		}

	}

	/**
	 * Возвращает массив цифр, входящих в число
	 * 
	 * @param number
	 * @return int[];
	 */

	private static int[] getDigitalFromNumber(int number) {

		int tmpNumber;
		int[] digitsNumber;

		tmpNumber = number < 0 ? number * (-1) : number;
		digitsNumber = new int[("" + tmpNumber).length()];

		for (int i = 0; i < digitsNumber.length; i++) {

			digitsNumber[i] = tmpNumber % 10;
			tmpNumber = tmpNumber / 10;

		}

		Arrays.sort(digitsNumber);

		return digitsNumber;

	}

	/**
	 * Проверяет наличие значения search в массиве arr
	 * 
	 * @param arr
	 * @param search
	 * @return boolean;
	 */

	private static boolean inArray(int[] arr, int search) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == search) {

				return true;

			}

		}

		return false;
	}

	/**
	 * Сравнивает массивы, выводит значения, которые есть в каждом массиве
	 * 
	 * @param int[] first
	 * @param int[] second
	 * @return int[];
	 */

	private static int[] alignmentDigitals(int[] first, int[] second) {

		int[] digits;

		digits = new int[0];

		for (int i = 0; i < first.length; i++) {

			if (inArray(second, first[i]) && !inArray(digits, first[i])) {

				digits = arrayPush(digits, first[i]);

			}
		}

		return digits;
	}

	/**
	 * Добавляет в конец массива значение и возвращает новый массив
	 * 
	 * @param arr
	 * @param value
	 * @return int[];
	 */

	public static int[] arrayPush(int[] arr, int value) {

		int[] tmpArr;

		tmpArr = new int[arr.length + 1];

		for (int i = 0; i < arr.length; i++) {

			tmpArr[i] = arr[i];

		}

		tmpArr[tmpArr.length - 1] = value;

		return tmpArr;

	}

}
