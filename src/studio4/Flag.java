package studio4;

import java.awt.Color;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		StdDraw.clear();
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 16);
		Color red = new Color(255, 0, 0);
		Color pink = new Color(255, 182, 193);
		Color Green = new Color(0, 255, 0);
		StdDraw.setPenColor(255, 182, 193);
		StdDraw.filledRectangle(6, 6, 6, 6);
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledRectangle(3, 9, 2, 2);
		StdDraw.filledRectangle(9, 9, 2, 2);
		StdDraw.setPenColor(0, 255, 0);
		StdDraw.filledRectangle(6, 3, 6, 2);
		StdDraw.filledRectangle(6, 6, .5, .5);
		Color black = new Color(0, 0, 0);
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.filledRectangle(9, 9, .5, .5);
		StdDraw.filledRectangle(3, 9, .5, .5);
	}
}