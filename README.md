# My-shop
MyShop is a shop which allows users to download mobile applications (APPs) and publications like e-books and digital magazines. Applications and publication items in the MyShop are either free or can be bought for a price.

The program will allow the creation of a shop, filling it with products, creating users and simulating their interaction with the shop (requiring products, adding comments etc).

Program consists of multiple class files where I have demonstrated various OOPs concepts such as inheritance, polymorphism, method overriding, abstract classes, etc.

The MyShop class have two attributes: a list of Content and a list of User objects. Note that each content has a unique ID. An instance of the MyShop class named shop is created in the main method of MyShopMain. The interaction with this shop is simulated within the main method (see the MyShopMain.java class).

Mobile apps and publication items are Content of the MyShop. Each Content (either application or publication) is associated with the following information: an ID, name, number of downloads, price.
Application objects contain information such as ID, name, number of downloads and price. In addition, an Application object has an OS (operating system) type that presents the minimum operating system requirement. If no price is provided, the application is then free.
Another type of Content is Publication. In addition to the data that the Content class has, a Publication object also has: publisher and number of pages.
Book is one type of Publication. It has additional data: publisher, number of pages and author name. Notes, it is possible that one book have multiple authors.
Another type of Publication is Magazine, which has an additional data: volume. A magazine does not contain any author’s name.

The User class has an ID, a username. NOTE, username can be changed by changeName() method.
Customer is a type of user. Each customer has a phone number and available fund in the account. By default, a new user will start with 50 in balance.
Admin is a special type of user. Each admin has a password and a level. The level is an integer indicating the level of his/her admin privilege.

Each content item, either application or publication, can be reviewed by customers. Review is a collection of Comment object.
Customers can buy content through method download, where the parameter is a Content type of object. When a user buys any content, the price of that content needs to be deducted from the balance of that user.
