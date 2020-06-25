package module.one.linear;

/**
 * Дано натуральное число Т, которое представляет длительность прошедшего
 * времени в секундах. Вывести данное значение длительности в часах, минутах и
 * секундах в следующей форме: ННч ММмин SSc.
 */
class Task05 {
	public static void main(String[] args) {
		int T = 1231654; // time in second
		int h = T / 3600;
		int m = (T - h * 3600) / 60;
		int s = (T - h * 3600 - m * 60);
		String HH = (h < 10 ? "0" + h : "" + h);
		String mm = (m < 10 ? "0" + m : "" + m);
		String ss = (s < 10 ? "0" + s : "" + s);
		System.out.println(HH + "h:" + mm + "m:" + ss + "s");
	}
}