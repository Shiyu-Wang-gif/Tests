public class TestWebUser {
	// main
	public static void main(String[] args) {
		WebUser user1 = new WebUser("Shiyu", "123456");
		user1.printField();
		System.out.println();
		
		WebUser user2 = new WebUser("YiShi", "0000", "ys@sjtu.edu.cn");
		user2.printField();
	}
	
	// static code block
	static {
		System.out.println("Test the WebUser class");
	}
}