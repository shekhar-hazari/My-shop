
public class Magazine extends Publication{

	int volume;

	//Constructor
	public Magazine(String id, String name, double price, String publisher, int no_of_pages, int volume) {
		// TODO Auto-generated constructor stub
		super(id, name, price, publisher, no_of_pages);
		this.volume = volume;
	}

	//Printing all details of magazine
	public void print() {
		super.print();
		System.out.print("Volume: " + getVolume());
		System.out.println();
	}

	//Getter method to get volume of a magazine
	public int getVolume() {
		return volume;
	}

}
