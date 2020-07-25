//Add the packages that you need, e.g.
import java.util.*;

public class MyShop {

	// Instance variables that you need.
	// They must all be marked as private

	// Declare a private variable (array or similar) to store your Content objects here
	private ArrayList<Content> contents = new ArrayList<Content>();

	// Declare a private variable (array or similar) to store your User objects here
	private ArrayList<User> users = new ArrayList<User>();

	//Method to get all users in the shop
	public ArrayList<User> getUsers(){
		return users;
	}

	//Method to get all contents in the shop
	public ArrayList<Content> getContents(){
		return contents;
	}

	public MyShop() {
		// any code you need here
	}

	//Method to add contents to the shop
	public void addContent(Content c) {
		// add the content into your content list
		contents.add(c);
	}

	//Method to show contents in the shop
	public void showContent() {
		// add your code here
		for(int i=0; i<contents.size(); i++){
			contents.get(i).print();
		}
	}

	//Method to add users to the shop
	public void addUser(User u) {
		// add the user to your list of users
		users.add(u);
	}	

	//Method to show users in the shop
	public void showUser() {
		// add your code here
		for(int i = 0; i < users.size(); i++) {
			users.get(i).print();
		}
	}

	// Method too show all the Reviews
	public void showAllReviews() {
		System.out.println("################################    All reviews    ################################");
		for (int j = 0; j < contents.size(); j++) {
			if (contents.get(j).commentsCheck()) {
				contents.get(j).showReviews();
			}
		}
	}

	//Method to show all the downloads
	public void showDownloads() {
		int totalDownloads = 0;

		for (int i = 0; i < contents.size(); i++) {
			totalDownloads = totalDownloads + contents.get(i).getNo_of_downloads();
		}

		System.out.println("\nThe total number of downloads from the shop: " + totalDownloads);
	}

	//Method to change price of all contents in the shop
	public void setPrice(boolean success, int level, double rate) {
		if (success) {
			if (level > 5) {//Checking if the level is over 5 to authorize changing prices in bulk
				for (int i = 0; i < contents.size(); i++) {
					if (contents.get(i).getPrice() > 0) {
						contents.get(i).setPrice(true, contents.get(i).getPrice()*(1+rate));
					}
				}
			}
			else System.out.println("Unauthorised for the operation!! Level should be greater than 5");
		}
		else System.out.println("Incorrect Passwords!! The prices remain unchanged");
	}

}