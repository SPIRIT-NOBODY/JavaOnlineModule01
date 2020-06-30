package com.epam.learn.linear;

import java.util.Scanner;

/**
 * Для данной области составить линейную программу, которая печатает true, если
 * точка с координатами (х, у) принадлежит закрашенной области, и false — в
 * противном случае:
 */

public class Task06 {
	
	public static void main(String[] args) {
		
		/*
		 * Принадлежность к первому прямоугольнику можно описать системой равенств:
		 * y <= 4 ; A = 0, B = 1 C = -4 
		 * y >=0; A =0 B = 1 , C = 0 
		 * x <= 2; A = 1,B = 0, C = -2 
		 * x >=-2; A = 1 B = 0 C = 2
		 *
		 * Принадлежность ко второму прямоугольнику можно описать системой равенств:
		 *  y <= 0; A = 0, B = 1, C = 0 
		 *  y >= -3; A = 0, B = 1, C = 3 
		 *  x <= 4; A = 1, B = 0, C = -4 
		 *  x >= -4; A = 1, 0 4
		 *
		 * Принадлежность к эллипсу описывается : 
		 *  (x - x0)^2 / a^2 + (y - y0)^2 / b^2 < 1
		 * x0 = 0 
		 * y0 = -1 
		 * a = 0.5 
		 * b = 0.9
		 */
		
		double pointX = 2;	
		double pointY = 3;		
		double x0 ; 
		double y0;
		double a;
		double b;
		
		boolean inFirstRect;
		boolean inSecondRect;
		boolean inEllipse;
		boolean isInside;		
		
		x0 = 0;
		y0 = -1;
		a = 0.5;
		b = 0.9;

		inFirstRect = pointX <= 2 && pointX >= -2 && pointY <= 4 && pointY >= 0;
		
		inSecondRect = pointX <= 4 && pointX >= -4 && pointY <= 0 && pointY >= -3;
		
		inEllipse = Math.pow((pointX - x0), 2) / (a * a) + Math.pow((pointY - y0), 2) / (b * b) < 1;
		
		isInside = !inEllipse && (inFirstRect || inSecondRect);

		System.out.println(isInside);
	}
	
}