package info;

public class ProductDetails {
	// field
	private int serialNumber;
	private String name;
	private ProductCategory category;
	private int quantity;
	private double price;
	
	// constructor
	public ProductDetails() {
		
	}
	
	public ProductDetails(int serialNumber, String name, ProductCategory category, int quantity, double price) {
		this.setSerialNumber(serialNumber);
		this.name = name;
		this.category = category;
		this.setQuantity(quantity);
		this.setPrice(price);
	}
	
	// setter and getter
	public void setSerialNumber(int serialNumber) {
		if (serialNumber >= 0) {
			this.serialNumber = serialNumber;
		}
		else {
			System.out.println("Invalid serial number!");
		}
	}
	
	public int getSerialNumber() {
		return this.serialNumber;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setCategory(ProductCategory category) {
		this.category = category;
	}
	
	public ProductCategory getCategory() {
		return this.category;
	}
	
	public void setQuantity(int quantity) {
		if (quantity > 0) {
			this.quantity = quantity;
		}
		else {
			System.out.println("Invalid quantity!");
		}
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		}
		else {
			System.out.println("Invalid price!");
		}
	}
	
	public double getPrice() {
		return this.price;
	}
	
	// method
	public void printInfo() {
		System.out.println("Product: " + this.name);
		System.out.println("Serial number: " + this.serialNumber);
		System.out.println("Category: " + this.category.getName());
		System.out.println("Category serial number: " + this.category.getSerialNumber());
		System.out.println("Quantity: " + this.quantity);
		System.out.println("Price: " + this.price);
		System.out.println("Total price: " + this.quantity * this.price);
	}
}