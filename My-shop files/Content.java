import java.util.*;

//An abstract class to represent all kinds of Contents in the shop
public abstract class Content {
	private String id;
	private String name;
	private int no_of_downloads;
	private double price;
	private ArrayList<Comment> comments = new ArrayList<Comment>();

	//Constructor
	public Content(String id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	//Abstract method to print all details of subclasses
	public abstract void print();

	//Getter methods
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getNo_of_downloads() {
		return this.no_of_downloads;
	}

	//Method to add review to the content the review belongs to
	public void addReview(Comment comment) {
		this.comments.add(comment);
	}

	// Method to show reviews all contents
	public void showReviews() {
		System.out.println("\n-------------------" + this.getName() + "(" + this.getId() + ")-------------------");
		if (comments.isEmpty()) {
			System.out.println("No reviews yet");
		}
		else {
			for (int i = 0; i < comments.size(); i++) {
				System.out.println(i+1 + ". Customer: " + this.comments.get(i).getCustomerUserName());
				if (comments.get(i).getRating() != 0) {
					System.out.println("Rating: " + comments.get(i).getRating());
				}
				if (comments.get(i).getComment() != null && comments.get(i).getComment() != "") {
					System.out.println("Comment: " + comments.get(i).getComment());
				}
			}
			System.out.println();
		}
	}

	//Method to check if comments for a Content exists or not
	public boolean commentsCheck() {
		if (comments.isEmpty()) {
			return false;
		}
		else return true;
	}

	//Method to keep count of downloads of a content
	public void incrementDownload() {
		no_of_downloads++;
	}

	//Method to show number of downloads of a content
	public void showDownloads() {
		System.out.println("\n# Downloads of " + this.getName() + ": " + this.getNo_of_downloads());
	}

	//Method to set price by an admin
	public void setPrice(boolean success, double newPrice) {
		if (success) {
			this.price = newPrice;
			System.out.println("The price of " + this.getName() + " (" + this.getId() + ") successfully set at: " + this.getPrice());
		}
		else System.out.println("Incorrect password!! The price is unchanged.");
	}
}
