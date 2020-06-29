package module.one.loops;

/**
 * Вывести на экран соответствий между символами и их численными обозначениями в
 * памяти компьютера
 */

public class Task06 {

	public static void main(String[] args) {
		
		System.out.println("Символы ASCII");
		
		for (int i = 0; i < 256; i++) {

			char tmpI;
			tmpI = (char) i;

			System.out.print("числу i = " + i + ", соответствует символ: \'");
			System.out.print(tmpI);
			System.out.println("\'");

		}

	}

}
