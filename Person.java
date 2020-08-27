public class Person {
	// field
	private String name;
	private int age;
	
	// constructor
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// setter and getter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		if (age >= 0) {
			this.age = age;
		}
		else {
			System.out.println("Invalid age input!");
		}
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	// method
	public void printField() {
		System.out.println("Name: " + this.name + "\nAge: " + this.age);
	}
	
	// main
	public static void main(String[] args) {
		Person person1 = new Person("Shiyu", 25);
		person1.printField();
	}
	
	// static code block
	static {
		System.out.println("Creating a person...");
	}
}