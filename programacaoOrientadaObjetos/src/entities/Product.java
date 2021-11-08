package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	public double totaValueInStock() {
		return price * quantity;
	}
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String toString() {
		return name
			+ " $ "
			+ String.format("%.2f", price)
			+ " , "
			+ quantity
			+ " unis, Total: $ "
			+ String.format("%.2f", totaValueInStock());
			
	}
	
}