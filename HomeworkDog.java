public class HomeworkDog {
	// field
	private String strain;
	private int age;
	private String mood;
	private String name;
	
	// constructor
	public HomeworkDog() {
		
	}
	
	public HomeworkDog(String strain, int age, String mood, String name) {
		this.strain = strain;
		this.setAge(age);
		this.setMood(mood);
		this.name = name;
	}
	
	// setter and getter
	public void setStrain(String strain) {
		this.strain = strain;
	}
	
	public void setAge(int age) {
		if (age >= 0) {
			this.age = age;
		}
		else {
			System.out.println("Invalid age!");
		}
	}
	
	public void setMood(String mood) {
		if((mood == "good") || (mood == "bad")) {
			this.mood = mood;
		}
		else {
			System.out.println("Invalid mood! The dog has a good mood.");
			this.mood = "good";
		}
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getStrain() {
		return this.strain;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getMood() {
		return this.mood;
	}
	
	public String getName() {
		return this.name;
	}
	
	// method
	public void bark() {
		System.out.print("The " + this.strain + " dog " + this. name + " has a " + mood + " mood and ");
		if (mood == "good") {
			System.out.println("lol.");
		}
		else {
			System.out.println("says nothing.");
		}
	}
	
	public void run() {
		System.out.print("The " + this.strain + " dog " + this. name + " has a " + mood + " mood and ");
		if (mood == "good") {
			System.out.println("runs around.");
		}
		else {
			System.out.println("lies down.");
		}
	}
	
	// main
	
	// static code block
}