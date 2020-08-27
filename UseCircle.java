public class UseCircle {
	// main
	public static void main(String[] args) {
		Circle circle1 = new Circle(2);
		double area = circle1.area();
		double perimeter = circle1.perimeter();
		System.out.println("Area: " + area + "\nPerimeter: " + perimeter);
	}
	
	// static code block
	static {
		System.out.println("Test the Circle class");
	}
}