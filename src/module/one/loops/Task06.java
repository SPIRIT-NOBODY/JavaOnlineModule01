package module.one.loops;

import java.util.Scanner;

/**
 * Вывести на экран соответствий между символами и их численными обозначениями в
 * памяти компьютера
 */

public class Task06 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String string = "";
		System.out.println("Enter string");
		string = input.nextLine();
		for (int i = 0; i < string.length(); i++) {
			int tempCode = (int) string.charAt(i);
			System.out.println("Symbol \"" + string.charAt(i) + "\" = " + tempCode);
		}
	}

}
