
public class Application extends Content{

	//Variable to store minimum OS requirement
	private String os;

	//Constructor
	public Application(String id, String name, double price, String os) {
		super(id, name, price);
		this.os = os;
	}

	//Constructor for input without price
	public Application(String id, String name, String os) {
		super(id, name, 0);
		this.os = os;
	}

	//Printing details of Application
	public void print() {
		System.out.println("\nID: " + super.getId() + "\nName: " + super.getName() + "\nPrice: " + super.getPrice() + "\nMinimum OS version: " + getOs());
	}

	//Getter method to get minimum OS requirement
	public String getOs() {
		return this.os;
	}

}
