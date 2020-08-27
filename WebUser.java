public class WebUser {
	// field
	private String userID;
	private String password;
	private String email;
	
	// constructor
	public WebUser() {
		
	}
	
	public WebUser(String userID, String password) {
		this.userID = userID;
		this.password = password;
		this.email = userID + "@gameschool.com";
	}
	
	public WebUser(String userID, String password, String email) {
		this.userID = userID;
		this.password = password;
		this.email = email;
	}
	
	// setter and getter
	public void setUserID(String userID) {
		this.userID = userID;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUserID() {
		return this.userID;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	// method
    public void printField() {
		System.out.println("User information\nUser ID: " + this.userID + "\nPassword: " + this.password + "\nEmail: " + this.email);
	}
	
	// main
	
	// static code block
}