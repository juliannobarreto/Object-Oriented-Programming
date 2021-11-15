package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Programm {
	 
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		product.setName("Computer");
		System.out.println("Upadate name: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Upadate price: " + product.getPrice());
		System.out.println("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity); /* atualiza o stock */
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		sc.close();
	}
}
