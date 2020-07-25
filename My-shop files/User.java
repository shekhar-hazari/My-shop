//User Abstract class
public abstract class User {
	private String userID;
	private String userName;


	//Constructor
	public User(String userID, String userName) {
		// TODO Auto-generated constructor stub
		this.userID = userID;
		this.userName = userName;
	}

	//Method to change the user name of a User
	public void changeName(String userName) {
		this.userName = userName;
	}

	//Getter methods
	public String getUserID() {
		return userID;
	}

	public String getName() {
		return userName;
	}

	//Abstract method to print all information of a user
	public abstract void print();

}
