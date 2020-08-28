package info;

public class ProductCategory {
	// field
	private int serialNumber;
	private String name;
	
	// constructor
	public ProductCategory() {
		
	}
	
	public ProductCategory(int serialNumber, String name) {
		this.setSerialNumber(serialNumber);
		this.name = name;
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
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getSerialNumber() {
		return this.serialNumber;
	}
	
	public String getName() {
		return this.name;
	}
	
	// method
	
	// main
	
	// static code block
}