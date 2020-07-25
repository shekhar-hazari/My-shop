
public class Comment {

	/*Comment consists of three parts:
	1.	The customer who is reviewing
	2.	Rating a customer can give
	3.	comment the customer types*/
	private Customer customer;
	private String comment;
	private int rating;

	//Constructor for Customer and a comment
	public Comment(Customer c, String comment) {
		// TODO Auto-generated constructor stub
		this.customer = c;
		this.comment = comment;
	}

	//Constructor for Customer and rating
	public Comment(Customer c, int rating) {
		this.customer = c;
		this.rating = rating;
	}

	//Constructor for Customer, rating and comment
	public Comment(Customer c, int rating, String comment) {
		this.customer = c;
		this.rating = rating;
		this.comment = comment;
	}

	//Constructor for Customer using  comment and rating
	public Comment(Customer c, String comment, int rating) {
		this.customer = c;
		this.rating = rating;
		this.comment = comment;
	}

	//Getter methods
	//Get username of the customer writing the review
	public String getCustomerUserName() {
		return customer.getName();
	}

	//Get rating given by the customer
	public int getRating() {
		return rating;
	}

	//Get comment written by the customer
	public String getComment() {
		return comment;
	}

}
