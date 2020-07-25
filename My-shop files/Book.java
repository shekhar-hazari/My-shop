import java.util.*;
public class Book extends Publication{

	//Variable to store authors of the book
	private ArrayList<String> author = new ArrayList<String>();

	//Constructor
	public Book(String id, String name, double price, String publisher, int no_of_pages, String [] author) {
		// TODO Auto-generated constructor stub
		super(id, name, price, publisher, no_of_pages);
		ArrayList<String> temp = new ArrayList<String>(Arrays.asList(author));
		this.author = temp;
	}

	//Print all details of the Book
	public void print() {
		super.print();
		getAuthors();
	}
	public void getAuthors(){
		System.out.print("Author(s): ");
		for(int i = 0; i < author.size(); i++) {
			System.out.print(this.author.get(i) + "\t");
		}
		System.out.println();
	}

}
