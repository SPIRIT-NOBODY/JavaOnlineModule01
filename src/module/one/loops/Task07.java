package module.one.loops;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Для каждого натурального числа в промежутке от m до n вывести все делители,
 * кроме единицы и самого числа. m и n вводятся с клавиатуры
 */

public class Task07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long m = 1;
		System.out.println("Введите  m > 1");
		while (m <= 1) {
			if (input.hasNextLong()) {
				m = input.nextLong();
			} else {
				System.out.println("Введите  m > 1");
				input.nextLine();
			}
		}
		System.out.println("m = " + m);
		long n;
		System.out.println("Введите n > m");
		n = m;
		while (m >= n) {
			if (input.hasNextLong()) {
				n = input.nextLong();
			} else {
				System.out.println("Введите n > m");
				input.nextLine();
			}
		}
		System.out.println("n = " + n);
		System.out.println("/-------------------------------/");
		for (long i = m; i <= n; i++) {
			ArrayList<Long> devider = new ArrayList<Long>();
			long k;
			for (k = 2; k < i; k++) {
				if (i % k == 0) {
					devider.add(k);
				}
			}
			if (devider.size() > 0) {
				System.out.println("Делители для " + i + ": " + devider);
			} else {
				System.out.println("Делители для " + i + " не найдены (кроме 1 и " + i + ")");
			}
		}
		input.close();
	}
}
