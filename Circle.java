public class Circle {
	// field
	private double radius;
	
	// constructor
	public Circle() {
		
	}
	
	public Circle(double radius) {
		if (radius > 0) {
			this.radius = radius;
		}
		else {
			System.out.println("Invalid radius input!");
		}
	}
	
	// setter and getter
	public void setRadius(double radius) {
		if (radius > 0) {
			this.radius = radius;
		}
		else {
			System.out.println("Invalid radius input!");
		}
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	// method
	public double area() {
		return Math.PI * this.radius * this.radius;
	}
	
	public double perimeter() {
		return 2 * Math.PI * this.radius;
	}
	
	// main
	
	// static code block
}