// My name: Shekhar Hazari
// My student ID: s3831855
// The highest level I've completed is: HD

//Add the packages that you need
import java.util.*;

public class MyShopMain {
	public static void main(String[] args) {

		//Creating shop
		MyShop shop = new MyShop();

		// Creating variable to store input for menu
		int choice = 19;

		//Variable to check if the inputs are correct
		boolean valid = false;

		//Scanner to take user input from keyboard
		Scanner scan = new Scanner(System.in);

		// ************************ Menu ***************************         
		//  Write a menu driven part to allow keyboard input
		//  Input validation is a must
		//  You may define method(s) for menu handling
		// ********************************************************** 
		//The menu is at the bottom after the provided test cases
		System.out.print("***************************    Welcome to the Shop    ***************************");
		System.out.println("\nPerforming predefined operations: ");



		// ***************   PASS LEVEL  ***************
		// *********************************************
		///*

		// create new publications
		String[] authors1 = {"L. Tolstoy"};
		Book b1 = new Book ("b1", "War and Peace", 12.55, "The Russian Messenger", 1225, authors1);

		String[] authors2 = {"F. Scott Fitzgerald"};
		Book b2 = new Book ("b2", "The great gatsby", 10, "Charles Scribner's Sons", 180, authors2);

		String[] authors3 = {"Thomas H. Cormen", "Charles E. Leiserson", "Ronald L.Rivest", "Clifford Stein"};
		Book b3 = new Book ("b3", "Introduction to algorithms", 100, "MIT Press", 1312, authors3);

		Magazine m1 = new Magazine("m1", "Forbes", 8.99, "Forbes Media", 50, 201904);

		// add new publications to the shop      
		shop.addContent(b1);
		shop.addContent(b2);
		shop.addContent(b3);
		shop.addContent(m1);

		// create new applications        
		Application g1 = new Application("g1", "Pokemon", 5.3, "androidV4");    
		Application g2 = new Application("g2", "Pokemon", 5, "iOSV10");
		//a free app
		Application app1 = new Application("app1", "Calendar", "androidV3"); 

		// add new applications to the shop         
		shop.addContent(g1);
		shop.addContent(g2);
		shop.addContent(app1);

		//Show all contents of the shop
		shop.showContent();

		//*/
		// ***************  CREDIT LEVEL ***************
		// ******** disable me if not completed ********
		///*

		// Adding new customers

		Customer c1 = new Customer("c1", "coolguy", "0412000", 200);
		Customer c2 = new Customer("c2", "neversaynever", "0433191");
		Customer c3 = new Customer("c3", "Hello 123", "0413456", 1000);
		Customer c4 = new Customer("c4", "Jackie Chan", "0417654");

		shop.addUser(c1);
		shop.addUser(c2);
		shop.addUser(c3);
		shop.addUser(c4);

		// Adding new admins 
		Admin a1 = new Admin("a1", "SuperBlack", "opensesame",10);
		Admin a2 = new Admin("a2", "Adele", "kitty123", 3);

		shop.addUser(a1);
		shop.addUser(a2);

		//Show all users which are added to the shop
		shop.showUser();

		c2.changeName("neversaybye"); // change the user name
		a1.changeName("superblack"); // make the user name in lowercase

		shop.showUser();

		//*/
		// ************* DISTINCTION LEVEL *************
		// ******** disable me if not completed ********
		///*


		// Create and add comments
		Comment comment1 = new Comment(c1, "This is a fantastic game!");
		g1.addReview(comment1);

		Comment comment2 = new Comment(c2, 5);
		g1.addReview(comment2);

		Comment comment3 = new Comment(c3, 3, "This is an average game!");
		g1.addReview(comment3);

		Comment comment4 = new Comment(c4, "I quite like this game!", 4);
		g1.addReview(comment4);

		g1.addReview(new Comment(c3, "The game crashes frequently"));

		b1.addReview(new Comment(c2, "I love Tolstoy!"));

		g1.showReviews(); //show comments for g1
		b1.showReviews(); //show comments for b1

		shop.showAllReviews(); //show all comments ever made


		// Simulating transactions, showing content etc etc. 
		// They can be driven by menu input as well.
		c1.download(b1);

		c1.download(b3);

		c1.download(m1);

		c1.showDownloads(); // show c1's downloads

		c2.download(m1);

		c3.download(m1);

		m1.showDownloads(); //show number of downloads of m1

		shop.showDownloads(); //show total of all downloads ever done
		/* 
		 */
		//*/
		// **************   HD  LEVEL   **************
		// ******** disable me if not completed ********
		///*


		//Make user premium
		c3.becomePremium();
		c3.download(b1);
		c3.download(g1);
		shop.showDownloads();

		c4.download(g1);
		c4.becomePremium();
		c4.download(m1);
		shop.showDownloads();


		Customer c5 = new Customer("c5", "neverenough", "0486734", 2000); 
		shop.showUser();
		Content[] list = {b1, b2, b3, m1, g1, g2, app1};

		// download many items in one go 
		c5.download(list);
		shop.addUser(c5);
		shop.showDownloads();

		//an admin can reset the price for an item 
		//b1.setPrice(a2.login(), 14.25);

		// an admin with level > 5 bulk reduces all prices by 10%
		//shop.setPrice(a1.login(), a1.getLevel(), -0.10);
		// other necessary code to test the required functionalities.

		//Menu to show options to the user
		do {
			try { //Try to check if the user only enters integers
				System.out.print("\n--------------------    Menu    --------------------\n");
				System.out.println("1. Add a book to the shop");
				System.out.println("2. Add a magazine to the shop");
				System.out.println("3. Add an application to the shop");
				System.out.println("4. Show all contents in the shop");
				System.out.println("5. Add a customer to the shop");
				System.out.println("6. Add an admin to the shop");
				System.out.println("7. Show all users of the shop");
				System.out.println("8. Add a review for a product.");
				System.out.println("9. Show all reviews for a content.");
				System.out.println("10. Show all reviews of all the contents in the shop.");
				System.out.println("11. Download a single content for a customer.");
				System.out.println("12. Show number of downloads of a content.");
				System.out.println("13. Show all downloads by a customer.");
				System.out.println("14. Show total number of downloads from the shop.");
				System.out.println("15. Make a customer premium.");
				System.out.println("16. Download (predefined) contents in bulk for a customer.");
				System.out.println("17. (Admin) Change price of a content.");
				System.out.println("18. (Admin) Change prices of all contents in the shop. ");
				System.out.println("19. Exit the shop.");
				choice = scan.nextInt();
				scan.nextLine();// Extra scan.nextLine() to consume the 'return' key from the input buffer
			}
			//Catching the error if the user gives any other input except for an integer
			catch (NumberFormatException exc) {
				System.err.println("Requires integer as input!! please try again");
				System.err.println(exc);
				continue;
			}
			//Catching any other sorts of error
			catch (Exception exc) {
				System.err.println("Problem with the input");
				System.out.println("Taking you back to main menu.");
				System.err.println(exc);
				continue;
			}

			switch (choice) {
			case 1:// Adding a book to the shop
				do{
					valid = false;
					//Try block to check if the user gives any other kind of input then what is expected
					try {
						System.out.print("\nEnter book id: ");
						String bookID;
						bookID = scan.nextLine();
						System.out.print("\nEnter book title: ");
						String bookTitle;
						bookTitle = scan.nextLine();
						System.out.print("\nEnter the price of the book (Enter 0 if the book is free of cost): ");
						double price;
						price = scan.nextDouble();
						scan.nextLine();
						System.out.print("\nEnter the publisher's name: ");
						String publisher;
						publisher = scan.nextLine();
						System.out.print("\nEnter the number of pages in the book: ");
						int pages;
						pages = scan.nextInt();
						scan.nextLine();//Consume the return pressed after entering the integer
						//For better user of memory using arraylist to store the author names
						ArrayList<String> authors = new ArrayList<String>();
						char more = 'n';
						//Take one or more Author names to be added to the book
						do {
							System.out.print("Enter the Authors' Name: ");
							String author;
							author = scan.nextLine();
							authors.add(author);
							System.out.println("Want to add more? (enter 'y' or 'Y' for yes. Any other character will be considered no) ");
							more = scan.next(".").charAt(0);
							scan.nextLine();
						}while (more == 'y' || more == 'Y');
						String [] authorsArray = {};//Creating empty array to store the authors from arraylist
						//Converting the arraylist to array to be given as input for book creation
						authorsArray = authors.toArray(authorsArray);
						Book b = new Book(bookID, bookTitle, price, publisher, pages, authorsArray);
						System.out.println("Adding the book to contents");
						shop.addContent(b);
						valid = true;
					}
					//Catch the exceptions if any made during runtime
					catch (NoSuchElementException e) {
						// TODO: handle exception
						scan.nextLine();
						System.err.println("Problem with the input!!! Enter the responses for book creation again.");
						System.err.println(e);
					}
					catch (NumberFormatException e) {
						scan.nextLine();
						System.out.println("Incorrect number format!! Try Again");
					}
				}while(!valid);
				break;
			case 2:// Adding a magazine to the shop
				do{
					valid = false;
					try {
						System.out.print("\nEnter magazine id: ");
						String magID;
						magID = scan.nextLine();
						System.out.print("\nEnter magazine name: ");
						String magTitle;
						magTitle = scan.nextLine();
						System.out.print("\nEnter the price of the magazine (Enter 0 if the magazine is free of cost): ");
						double price;
						price = scan.nextDouble();
						scan.nextLine();
						System.out.print("\nEnter the publisher's name: ");
						String publisher;
						publisher = scan.nextLine();
						System.out.print("\nEnter the number of pages in the magazine: ");
						int pages;
						pages = scan.nextInt();
						System.out.print("\nEnter the volume of the magazine: ");
						int volume;
						volume = scan.nextInt();
						Magazine m = new Magazine(magID, magTitle, price, publisher, pages, volume);
						System.out.println("Adding the magazine to contents.");
						shop.addContent(m);
						valid = true;
					}
					catch (NoSuchElementException e) {
						// TODO: handle exception
						scan.nextLine();
						System.err.println("Problem with the input!!! Enter the responses for magazine creation again.");
						System.err.println(e);
					}
					catch (NumberFormatException e) {
						scan.nextLine();
						System.out.println("Incorrect number format!! Try again");
					}
				}while(!valid);
				break;

			case 3:// Adding an application to the shop
				do{
					valid = false;
					try {
						System.out.print("\nEnter Application id: ");
						String appID;
						appID = scan.nextLine();
						System.out.print("\nEnter Application name: ");
						String appName;
						appName = scan.nextLine();
						System.out.print("\nEnter the price of the application (Enter 0 if the application is free of cost): ");
						double price;
						price = scan.nextDouble();
						scan.nextLine();
						System.out.print("\nEnter the minimum OS required: ");
						String os;
						os = scan.nextLine();
						Application app = new Application(appID, appName, price, os);
						System.out.println("Adding the application to contents of the shop");
						shop.addContent(app);
						valid = true;
					}
					catch (NoSuchElementException e) {
						// TODO: handle exception
						scan.nextLine();
						System.err.println("Problem with the input!!! Enter the responses for application creation again.");
						System.err.println(e);
					}
					catch (NumberFormatException e) {
						scan.nextLine();
						System.out.println("Incorrect number format!! Try again");
					}
				}while(!valid);
				break;
			case 4: //Show all contents added to the shop
				shop.showContent();
				break;
			case 5:// Adding a customer type of user to the shop
				do{
					valid = false;
					try {
						System.out.print("\nEnter customer User id: ");
						String custID;
						custID = scan.nextLine();
						System.out.print("\nEnter customer username: ");
						String custName;
						custName = scan.nextLine();
						System.out.print("\nEnter the initial funds of the customer: ");
						double fund;
						fund = scan.nextDouble();
						scan.nextLine();
						System.out.print("\nEnter phone number of the customer: ");
						String phone;
						phone = scan.nextLine();
						Customer cust = new Customer(custID, custName, phone, fund);
						System.out.println("Adding the customer to users in the shop");
						shop.addUser(cust);
						valid = true;
					}
					catch (NoSuchElementException e) {
						// TODO: handle exception
						scan.nextLine();
						System.err.println("Problem with the input!!! Enter the responses for Customer creation again.");
						System.err.println(e);
					}
					catch (NumberFormatException e) {
						scan.nextLine();
						System.out.println("Incorrect number format!! Try again");
					}
				}while(!valid);
				break;

			case 6: // Adding an Admin user to the shop
				do{
					valid = false;
					try {
						System.out.print("\nEnter Admin User id: ");
						String adminID;
						adminID = scan.nextLine();
						System.out.print("\nEnter Admin's username: ");
						String adminName;
						adminName = scan.nextLine();
						System.out.print("\nEnter the level of the admin: ");
						int level;
						level = scan.nextInt();
						scan.nextLine();
						System.out.print("\nEnter password of the admin: ");
						String password;
						password = scan.nextLine();
						Admin admin = new Admin(adminID, adminName, password, level);
						System.out.println("Adding the Admin to users in the shop");
						shop.addUser(admin);
						valid = true;
					}
					catch (NoSuchElementException e) {
						// TODO: handle exception
						scan.nextLine();
						System.err.println("Problem with the input!!! Enter the responses for Admin creation again.");
						System.err.println(e);
					}
					catch (NumberFormatException e) {
						scan.nextLine();
						System.out.println("Incorrect number format!! Try again");
					}
				}while(!valid);
				break;

			case 7:// Show all the users added to the shop
				shop.showUser();
				break;

			case 8:// Add a review for a content in the shop using a user ID
				do{
					valid = false;
					try {
						System.out.print("\nEnter Customer User id of the user writing the review: ");
						String custID, contID;
						custID = scan.nextLine();
						boolean foundUser = false;//Variable to check if an user exists
						boolean foundContent = false; //Variable to check if the content exists in the shop
						User cust = shop.getUsers().get(0);
						for (int i = 0; i < shop.getUsers().size(); i++) {
							if (shop.getUsers().get(i).getUserID().contentEquals(custID) ) {
								cust = shop.getUsers().get(i);
								foundUser = true;
							}
						}
						if (foundUser) {//Only if the user writing the review is found you proceed further
							System.out.println("Enter the content ID of the content, review is being written for: ");
							contID = scan.nextLine();
							Content c = shop.getContents().get(0);

							for (int i = 0; i < shop.getContents().size(); i++) {
								if(shop.getContents().get(i).getId().contentEquals(contID)) {
									c = shop.getContents().get(i);
									foundContent = true;
								}
							}
							if (foundContent) {//If both user and content are found then you can enter the review 
								System.out.print("\nEnter the rating: ");
								int rating;
								rating = scan.nextInt();
								scan.nextLine();
								System.out.print("\nEnter comment for the content: ");
								String review;
								review = scan.nextLine();
								Comment comment = new Comment((Customer)cust, rating, review);
								System.out.println("Adding the review.");
								c.addReview(comment);
								valid = true;
							}
							else System.out.println("No such content found!!! Please begin again");
						}
						else System.out.println("No such user found!!! Please try again");
					}
					catch (NoSuchElementException e) {
						// TODO: handle exception
						scan.nextLine();
						System.err.println("Problem with the input!!! Enter the responses again.");
						System.err.println(e);
					}
					catch (NumberFormatException e) {
						scan.nextLine();
						System.out.println("Incorrect number format");
					}
				}while(!valid);
				break;
			case 9://See review of a content of choice
				do {
					valid = false;
					try {
						System.out.println("Enter the content ID of the content, you want to see the reviews of: ");
						String contID = scan.nextLine();
						Content c = shop.getContents().get(0);
						for(int i = 0; i < shop.getContents().size(); i++) {// Loop to check if the content exists
							if (shop.getContents().get(i).getId().contentEquals(contID)) {
								c = shop.getContents().get(i);
								valid = true;
							}
						}
						if (valid) {
							c.showReviews();
						}        				
					}
					catch (NoSuchElementException e) {
						// TODO: handle exception
						scan.nextLine();
						System.err.println("Problem with the input!!! Enter the responses again.");
						System.err.println(e);
					}
				}while (!valid);
				break;
			case 10:// Show all reviews of all the contents in the shop
				shop.showAllReviews();
				break;
			case 11:// Download one content for a Customer
				do{
					valid = false;
					try {
						System.out.print("\nEnter Content id of the content to be downloaded: ");
						String contID, custID;
						contID = scan.nextLine();
						boolean foundCustomer = false; 
						boolean foundContent = false;
						Content cont = shop.getContents().get(0);
						User cust = shop.getUsers().get(0);
						for (int i = 0; i < shop.getContents().size(); i++) {// Loop to check if the desired content exists
							if (shop.getContents().get(i).getId().contentEquals(contID) ) {
								cont = shop.getContents().get(i);
								foundContent = true;
							}
						}
						if (foundContent) {// If the content is found.... Check if the Customer who wants to download the content exists
							System.out.println("Enter Customer ID of the customer who is downloading: ");
							custID = scan.nextLine();
							for (int j = 0; j < shop.getUsers().size(); j++) {
								if (shop.getUsers().get(j).getUserID().contentEquals(custID)) {
									cust = shop.getUsers().get(j);
									foundCustomer = true;
								}
							}
							if (foundCustomer) {// If both the contents and customer are found, only then download
								((Customer)cust).download(cont);
								valid = true;
							}
							else {
								System.out.println("No such customer exists!! Please begin again");
							}
						}
						else {
							System.out.println("No such content exists!!! Please try again");
						}
					}
					catch (NoSuchElementException e) {
						// TODO: handle exception
						scan.nextLine();
						System.err.println("Problem with the input!!! Enter the responses for magazine creation again.");
						System.err.println(e);
					}
				}while(!valid);
				break;

			case 12:// To see the number of downloads of a content
				do {
					valid = false;
					try {
						System.out.println("Enter the content ID of which you'd like to see the number of downloads ");
						String contID = scan.nextLine();
						Content c = shop.getContents().get(0);
						for (int i = 0; i < shop.getContents().size(); i++) {// Loop to see if the content exists
							if (shop.getContents().get(i).getId().contentEquals(contID)) {
								valid = true;
								c = shop.getContents().get(i);
							}
						}
						c.showDownloads();
					}
					catch (Exception e) {
						System.err.println("Problem with the input!! Enter the responses again");
						System.err.println(e);
					}
				}while (!valid);
				break;
			case 13:// Show the names of the contents downloaded by a customer
				do {
					valid = false;
					try {
						System.out.println("Enter the customer ID of the customer whose downloads you would like to see: ");
						String custID = scan.nextLine();
						User c = shop.getUsers().get(0);
						for(int i = 0; i < shop.getUsers().size(); i++) {//Loop to check if the customer exists
							if (shop.getUsers().get(i).getUserID().contentEquals(custID)) {
								c = shop.getUsers().get(i);
								valid = true;
							}
						}
						if (valid) {
							((Customer)c).showDownloads();
						}
						else System.out.println("No such customer exists!!! Please try again");
					}
					catch (Exception e) {
						System.err.println("Error in the input!! Please try again");
						System.err.println(e);
					}
				}while(!valid);
				break;
			case 14: // Show total number of downloads from the shop
				shop.showDownloads();
				break;
			case 15:// Make a customer premium
				do{
					valid = false;
					try {
						System.out.print("\nEnter id of customer you want to make premium: ");
						String custID;
						custID = scan.nextLine();
						User cust = shop.getUsers().get(0);
						for (int i = 0; i < shop.getContents().size(); i++) {//Check if the customer exists
							if (shop.getUsers().get(i).getUserID().contentEquals(custID)) {
								cust = shop.getUsers().get(i);
								valid = true;
							}
						}
						if (valid) {
							((Customer)cust).becomePremium();
						}
						else {
							System.out.println("No such user exists!!! Please try again");
						}
					}
					catch (Exception e) {
						// TODO: handle exception
						scan.nextLine();
						System.err.println("Problem with the input!!! Enter the responses for magazine creation again.");
						System.err.println(e);
					}
				}while(!valid);
				break;
			case 16:// Download contents in bulk for a selected customer
				do {
					valid = false;
					try {
						Content [] list2 = {b1, b2, b3, m1, g1, g2, app1}; // Predefined list of contents
						System.out.println("Enter the cutomer ID of the customer for whom you want to download contents in bulk: ");
						String cust = scan.nextLine();
						User c = shop.getUsers().get(0);
						for (int i = 0; i < shop.getUsers().size(); i++) {// Loop to check if the cutomer exists
							if (shop.getUsers().get(i).getUserID().contentEquals(cust)){
								c = shop.getUsers().get(i);
								valid = true;
							}
						}
						if (valid) {
							((Customer) c).download(list2);
						}
						else System.out.println("No such customer found!! Please try again");
					}
					catch (Exception e) {
						System.err.println("Some error please try again.");
						System.err.println(e);
					}
				}while (!valid);
				break;
			case 17: // Change price of a content using an admin login
				do{
					valid = false;
					try {
						System.out.println("\nEnter id of admin: ");
						String adminID = scan.nextLine();
						boolean adminFound = false;//Variable to check if the admin exists
						boolean contentFound = false;// Variable to check if the content exists
						User ad = shop.getUsers().get(0);
						for (int i = 0; i < shop.getUsers().size(); i++) {
							if (shop.getUsers().get(i).getUserID().contentEquals(adminID)) {//Loop to check if the admin exists
								adminFound = true;
								System.out.println("Admin Found!!");
								ad = shop.getUsers().get(i);
							}
						}
						if (adminFound) {//If admin exists the perform the rest of the operations
							double newPrice;
							System.out.println("Enter the new price");
							newPrice = scan.nextDouble();
							scan.nextLine();
							String product;
							System.out.println("Please enter the content id of which price has to be changed");
							product = scan.nextLine();
							Content c = shop.getContents().get(0);
							for (int i = 0; i < shop.getContents().size(); i++) {// If the rest of the inputs are correct check if the content exists 
								if(shop.getContents().get(i).getId().contentEquals(product)) {
									c = shop.getContents().get(i);
									contentFound = true;
								}        							
							}
							if (contentFound) {// If all the provided information is correct change the price
								valid = true;
								c.setPrice(((Admin)ad).login(), newPrice);
							}
							else System.out.println("No such content exists!! Please begin again");
						}
						else System.out.println("No such admin exists!! Please try again");
					}
					catch (NoSuchElementException e) {
						// TODO: handle exception
						scan.nextLine();
						System.err.println("Problem with the input!!! Enter the responses for magazine creation again.");
						System.err.println(e);
					}
					catch (Exception e) {
						// TODO: handle exception
						scan.nextLine();
						System.err.println("Problem with the input!!! Enter the responses for magazine creation again.");
						System.err.println(e);
					}
				}while(!valid);
				break;
			case 18: // Change price of all contents if the admin login is successful and the admin is above level 5
				do{
					valid = false;
					try {
						System.out.print("\nEnter id of admin: ");
						String adminID;
						boolean foundAdmin = false;
						adminID = scan.nextLine();
						User ad = shop.getUsers().get(0);
						for (int i = 0; i < shop.getUsers().size(); i++) {// Loop to check if the admin exists
							if (shop.getUsers().get(i).getUserID().contentEquals(adminID)) {
								foundAdmin = true;
								ad = shop.getUsers().get(i);
							}
						}
						if (foundAdmin) {//If admin is found take rest of the inputs
							System.out.println("Enter the rate by which you wish to change the price of all products: ");
							double rate = scan.nextDouble();
							scan.nextLine();
							shop.setPrice(((Admin)ad).login(), ((Admin)ad).getLevel(), rate);
							valid = true;
						}
						else System.out.println("No such admin exists!! Please try again");
					}
					catch (NoSuchElementException e) {
						// TODO: handle exception
						scan.nextLine();
						System.err.println("Problem with the input!!! Enter the responses for magazine creation again.");
						System.err.println(e);
					}
					catch (Exception e) {
						// TODO: handle exception
						scan.nextLine();
						System.err.println("Problem with the input!!! Enter the responses for magazine creation again.");
						System.err.println(e);
					}
				}while (!valid);
				break;
			case 19:// Quit the shop
				System.out.println("Quitting the shop");
				break;
			default://Quitting the shop if no input in range 1-18 is selected
				System.out.println("The input was not in the range 1-18!! Quitting the shop.");
			}


		}while (choice >= 1 && choice < 19);
		scan.close();//Close the scanner object

	}
}