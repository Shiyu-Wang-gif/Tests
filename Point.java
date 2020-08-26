public class Point {
	// field 
	double x;
	double y;
	static String var = "static instance variable test";
	
	// constructor
	public Point(String str) {
		System.out.println(str);
	}
	
	public Point(double x, double y) {
		this("Initializing...");
		this.x = x;
		this.y = y;
	}
	
	// method
	void print() {
		System.out.println("(" + x + ", " + y + ")");
	}
	
	double distance(Point p) {
		return Math.sqrt((x - p.x)*(x - p.x) + (y - p.y)*(y - p.y));
	}
	
	void coordinateExchange(Point p) {
		double temp;
		temp = p.x;
		p.x = x;
		x = temp;
		
		temp = p.y;
		p.y = y;
		y = temp;
	}
	
	static void test() {
		System.out.println("static method test");
	}
	
	// main
	public static void main(String[] args) {
		Point p1 = new Point(2, 3);
		Point p2 = new Point(3, 4);
		p1.print();
		p2.print();
		
		System.out.println("Distance: " + p1.distance(p2));
		
		p1.coordinateExchange(p2);
		p1.print();
		p2.print();
		
		System.out.println(Point.var);
		Point.test();
	}
}