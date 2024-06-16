import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


class MyLibrary{
	LinkedHashMap<String, String> data = new LinkedHashMap<>(100);
	LinkedHashMap<String, String> issueData = new LinkedHashMap<>(100);
	LinkedHashMap<String, String> returnData = new LinkedHashMap<>(100);


	MyLibrary(){
		data.put("Think and Grow Rich", "Napoleon Hill");
		data.put("Rich", null);
		data.put("Mad Man", null);
		data.put("Seneca", "Harry");
    }


	void availalbeBooks(){
		int i=0;
		for (String book:data.keySet()) {
			i++;
			String message;
			if((data.get(book))==null){
				message = "NA";
			}else {
				message = data.get(book);
			}
			System.out.println(i+" "+book +" ---> Author Name: "+ message);
		}
	}

	void issueData(){
		int i=0;
		System.out.println(issueData.keySet());
		for (String book:issueData.keySet()) {
			i++;
			String message;
			if((issueData.get(book))==null){
				message = "NA";
			}else {
				message = issueData.get(book);
			}
			System.out.println(i+" "+book +" ---> Issued By: "+ message);
		}
	}

	void addBooks(String bookName, String author){
		data.put(bookName, author);
	}

	void addBooks(String bookName){
		data.put(bookName, null);
	}

	void issueBook(String un, String bookName){
		LocalDateTime n = LocalDateTime.now();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy h:m:s");
		String saveTime = n.format(df);
		if(data.containsKey(bookName)){
			issueData.put(bookName, un+" at "+  (saveTime));
			issueData();
			returnData.put(bookName, data.get(bookName));
			data.remove(bookName);
		}else {
			System.out.println("This book is not available in our library");
		}


	}

	void returnBook(String bookName){
		if (issueData.containsKey(bookName)){
			addBooks(bookName, returnData.get(bookName));
			issueData.remove(bookName);
			System.out.println("Thanks, Book Returned.");
		}else {
			System.out.println("This book is not issued form this library. If you want to add this to our library choose option 4 to add.");
		}

	}

}


public class LibraryManagementSystem {
	public static void main(String[] args) {
		/*
        Create a library management system which is capable of issuing books to the students.
        Book should have info like:
        1. Book name
        2. Book Author
        3. Issued to
        4. Issued on
        User should be able to add books, return issued books, issue books
        Assume that all the users are registered with their names in the central database
         */

		MyLibrary ml = new MyLibrary();
		System.out.println("Welcome to Central Library.");
		System.out.println("Here is some option you can choose according to your need.");

		boolean flag = true;
		while (flag){
			Scanner sc = new Scanner(System.in);
			Scanner sc1 = new Scanner(System.in);


			System.out.print("\n-->Press 1 for Show Available Books\t");
			System.out.print("-->Press 2 for Issue Available Books\t");
			System.out.print("-->Press 3 for return Issue Book\t");
			System.out.print("-->Press 4 for Add a Book\t");
			System.out.print("-->Press 5 for Issued Book Summary\n");
			System.out.println("You Can Press Q/q Quit from Library");
			String event = sc.next();

			if(event.equals("1")){
				ml.availalbeBooks();
			}else if (event.equals("2")){
				System.out.println("Type Your Name: ");
				String userName = sc1.nextLine();
				System.out.println("Type the name of book you want: ");
				String bookName = sc1.nextLine();
				ml.issueBook(userName, bookName);
			}else if(event.equals("3")){
				System.out.println("Which Book You want to return");
				String bookName = sc1.nextLine();
				ml.returnBook(bookName);
			}else if(event.equals("4")){
				System.out.println("Which Book You want to add");
				String bookName = sc1.nextLine();
				System.out.println("Do you know the author name (Write noting if you don`t, just press enter): ");
				String author = sc1.nextLine();
				if(author.equals("")){
					ml.addBooks(bookName);
				}else{
					ml.addBooks(bookName, author);
				}
			}else if(event.equalsIgnoreCase("Q")){
				flag = false;
			}else if(event.equals("5")){
				ml.issueData();
			}
		}
		System.out.println("Thanks for using our program.");
	}

}