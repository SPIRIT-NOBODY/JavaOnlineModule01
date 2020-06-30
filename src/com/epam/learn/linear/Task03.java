package com.epam.learn.linear;

/**
 * Вычислить значение выражения по формуле (все переменные принимают
 * действительные значения): ((sin(x) + cos(y)) / (cos(x) - sin(y))) * tg(xy)
 */

class Task03 {

	public static void main(String[] args) {

		double x;
		double y;

		x = 5;
		y = 12;

		System.out.println("Result function = " + compute(x, y));

	}

	private static double compute(double x, double y) {

		double numerator;
		double denominator;

		numerator = Math.sin(x) + Math.cos(y);
		denominator = Math.cos(x) - Math.sin(y);

		return ((numerator / denominator) * Math.tan(x * y));

	}

}