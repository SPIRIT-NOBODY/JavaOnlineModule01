package com.epam.learn.conditional;

/**
 * Даны два угла треугольника (в градусах). Определить, существует ли такой
 * треугольник, и если да, то будет ли он прямоугольным.
 */

public class Task01 {

	public static void main(String[] args) {

		double angle1;
		double angle2;

		angle1 = 180;
		angle2 = 30;

		if ((angle1 + angle2) < 180) {

			System.out.println("Треугольник существует");

			if (angle1 == 90 || angle2 == 90 || (angle1 + angle2) == 90) {

				System.out.println("Треугольник прямоугольный");

			}
		} else {

			System.out.println("Треугольник не существует");

		}
	}
}
