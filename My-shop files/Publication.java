
public class Publication extends Content{

	private String publisher;
	private int no_of_pages;

	//Constructor
	public Publication(String id, String name, double price, String publisher, int no_of_pages) {
		// TODO Auto-generated constructor stub
		super(id, name, price);
		this.publisher = publisher;
		this.no_of_pages = no_of_pages;
	}

	//Print all details of the magazine
	public void print() {
		System.out.println("\nID: "+ getId() + "\nName:" + getName() + "\nPrice: " + getPrice());
		System.out.println("Publisher: " + this.getPublisher() + "\nNumber of pages: " + this.getNo_of_pages());
	}

	//Getter methods
	public String getPublisher() {
		return publisher;
	}
	public int getNo_of_pages() {
		return no_of_pages;
	}

}
