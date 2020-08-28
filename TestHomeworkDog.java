public class TestHomeworkDog {
	// main
	public static void main(String[] args) {
		HomeworkDog dog1 = new HomeworkDog("unknown", 10, "sdfa", "One one");
		HomeworkDog dog2 = new HomeworkDog("unknown", 20, "bad", "Two two");
		
		dog1.bark();
		dog1.run();
		dog2.bark();
		dog2.run();
	}
	
	// static code block
	static {
		System.out.println("Test the HomeworkDog class");
	}
}