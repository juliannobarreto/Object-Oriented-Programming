package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class ProgramTriangle {

		public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			
			Scanner sc = new Scanner(System.in);
			
			Triangle x, y;
			x = new Triangle();
			y = new Triangle();
			
			System.out.println("Enter the measures of tringle X: ");
			x.a = sc.nextDouble();
			x.b = sc.nextDouble();
			x.a = sc.nextDouble();
			System.out.println("Enter the measures of triangle Y: ");
			y.a = sc.nextDouble();
			y.b = sc.nextDouble();
			y.c = sc.nextDouble();
			
			double areax = x.area();
			
			double areay = y.area();
			
			System.out.printf("Triangle X area: %.f%n", areax);
			System.out.printf("Triangle Y area: %.f%n", areay);
			
			if (areax > areay) {
				System.out.println("Larger area: X");
			}else {
				System.out.println("Larger are: Y");
			}
			sc.close();
		}
}
