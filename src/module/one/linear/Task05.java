package module.one.linear;

/**
 * Дано натуральное число Т, которое представляет длительность прошедшего
 * времени в секундах. Вывести данное значение длительности в часах, минутах и
 * секундах в следующей форме: ННч ММмин SSc.
 */

class Task05 {

	public static void main(String[] args) {

		int T;
		int h;
		int m;
		int s;
		String HH;
		String mm;
		String ss;

		T = 1231654;
		h = T / 3600;
		m = (T - h * 3600) / 60;
		s = T - h * 3600 - m * 60;

		HH = h < 10 ? "0" + h : "" + h;
		mm = m < 10 ? "0" + m : "" + m;
		ss = s < 10 ? "0" + s : "" + s;

		System.out.println(HH + "h:" + mm + "m:" + ss + "s");
	}

}