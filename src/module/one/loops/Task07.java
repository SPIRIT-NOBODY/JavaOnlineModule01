package module.one.loops;

import java.util.Scanner;

/**
 * Для каждого натурального числа в промежутке от m до n вывести все делители,
 * кроме единицы и самого числа. m и n вводятся с клавиатуры
 */

public class Task07 {
	
	public static void main(String[] args) {

		Scanner input;
		long m;
		long n;

		m = 1;
		input = new Scanner(System.in);		

		while (m <= 1) {
			System.out.println("Введите  m > 1");
			if (input.hasNextLong()) {

				m = input.nextLong();

			} else {
				
				input.nextLine();

			}

		}

		System.out.println("m = " + m);		

		n = m;

		while (m >= n) {
			
			System.out.println("Введите n > m");
			
			if (input.hasNextLong()) {

				n = input.nextLong();

			} else {
				
				input.nextLine();

			}
		}

		System.out.println("n = " + n);

		System.out.println("/-------------------------------/");

		for (long i = m; i <= n; i++) {

			long[] devider;
			long k;

			devider = new long[0]; // массив делителей

			for (k = 2; k < i; k++) {

				if (i % k == 0 && i != k) {

					devider = arrayPush(devider, k);

				}

			}

			if (devider.length > 0) {

				System.out.print("Делители для числа " + i + ": [");

				for (int d = 0; d < devider.length; d++) {

					System.out.print(devider[d] + (d + 1 != devider.length ? ", " : ""));

				}

				System.out.println("]");

			} else {

				System.out.println("Делители для числа " + i + " не найдены (кроме 1 и " + i + ")");

			}

		}

	}

	/**
	 * Добавляет в конец массива значение и возвращает новый массив
	 * 
	 * @param arr
	 * @param value
	 * @return long[];
	 */

	public static long[] arrayPush(long[] arr, long value) {

		long[] tmpArr;

		tmpArr = new long[arr.length + 1];

		for (int i = 0; i < arr.length; i++) {

			tmpArr[i] = arr[i];

		}

		tmpArr[tmpArr.length - 1] = value;

		return tmpArr;

	}

}
