import java.util.*;
public class Customer extends User{

	//Variables to store phoneNo, funds available, downloads by a customer, and if a customer is premium or not
	private String phoneNo;
	private double fund;
	private ArrayList<Content> downloads = new ArrayList<Content>();
	private boolean premium;

	//Constructor
	public Customer(String userID, String userName, String phoneNo, double fund) {
		// TODO Auto-generated constructor stub
		super(userID, userName);
		this.phoneNo = phoneNo;
		this.fund = fund;
		this.premium = false;
	}

	public Customer(String userID, String userName, String phoneNo) {
		// TODO Auto-generated constructor stub
		super(userID, userName);
		this.phoneNo = phoneNo;
		this.fund = 50;
		this.premium = false;
	}

	//Getter methods
	public String getPhoneNo() {
		return phoneNo;
	}

	public double getFund() {
		return fund;
	}

	//Set funds of a Customer user....Helper function used in constructor
	public void setFund(double value) {
		this.fund = value;
	}

	//Printing all details of a customer
	public void print() {
		System.out.println("\nUser ID: " + getUserID() + "\nUser Name: " + getName() + "\nPhone Number: " + getPhoneNo() + "\nAvailable Fund: " + getFund());
	}

	//Method to download a single content
	public void download(Content c) {
		//Checking if the customer is premium customer to adjust price accordingly (give 20% discount)
		if (this.premium) {
			if (this.getFund() >= c.getPrice()*0.8) {
				this.downloads.add(c);
				this.setFund(this.getFund() - c.getPrice()*0.8);//Subtract the funds used to download the content
				c.incrementDownload();
				System.out.println();
				System.out.println(this.getName() + " bought " + c.getName() + ".");//Output if successful
			}
			else {
				System.out.println();
				System.out.println("Not enough fund."); //Output if unsuccessful
			}
		}
		//Same operations for non-premium customers except there is no discount
		else {
			if (this.getFund() >= c.getPrice()) {
				this.downloads.add(c);
				this.setFund(this.getFund() - c.getPrice());
				c.incrementDownload();
				System.out.println();
				System.out.println(this.getName() + " bought " + c.getName() + ".");
			}
			else {
				System.out.println();
				System.out.println("Not enough fund.");
			}
		}
	}

	//Show Downloaded contents' name
	public void showDownloads() {
		System.out.println("\n********************    " + this.getName() + "'s Downloads    ********************");
		for (int i = 0; i < downloads.size(); i++) {
			System.out.println(i+1 + ". " + downloads.get(i).getName());
		}
	}

	//Method to make a customer premium
	public void becomePremium() {
		if (this.getFund() >= 100) {
			this.setFund(getFund()-100);
			premium = true;
			System.out.println(this.getUserID() + " made premium.");
		}
		else System.out.println("Insufficient funds!!");
	}

	//Method to bulk download contents for a customer
	public void download(Content[] list) {
		//Variable to check if the customer has enough funds to cover the cost of downloads
		double totalCost = 0;

		if (this.premium) {
			for (int i = 0; i < list.length; i++) {
				totalCost = totalCost + list[i].getPrice()*0.8;
			}
		}
		else {
			for (int i = 0; i < list.length; i++) {
				totalCost = totalCost + list[i].getPrice();
			}
		}

		if (this.getFund() >= totalCost) {
			for (int i = 0; i < list.length; i++) {
				download(list[i]);
			}
		}
		else System.out.println("Sorry insuffcient funds!!!");
	}

}
