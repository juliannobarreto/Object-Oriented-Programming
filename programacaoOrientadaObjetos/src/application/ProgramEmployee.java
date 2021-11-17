package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramEmployee {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.println("Name: ");
		emp.name = sc.nextLine();
		
		System.out.println("Gloss Salary: ");
		emp.grossSalary = sc.nextDouble();
		
		System.out.println("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Employee: " + emp);
		System.out.println();
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Update data: " + emp);
		
		sc.close();
	}
}
