import java.util.Scanner;

public class Admin extends User{

	String password;
	int level;

	//Constructor to create an Admin
	public Admin(String userID, String userName, String password, int level) {
		// TODO Auto-generated constructor stub
		super(userID, userName);
		this.password = password;
		this.level = level;
	}
	//Getter methods

	//Method to get password
	public String getPassword() {
		return password;
	}

	//Method to get level of admin
	public int getLevel() {
		return level;
	}

	//Printing an admins details
	public void print() {
		System.out.println("\nUser ID: " + getUserID() + "\nUser Name: " + getName() + "\nLevel: " + getLevel());
	}

	//Login validation
	public boolean login() {
		String password = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the password: ");
		password = sc.nextLine();
		return ( this.getPassword().equals(password) );
	}

}
