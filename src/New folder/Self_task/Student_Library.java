import java.util.Scanner;
class Library
{
    String[] book;
    int noOfBooks;
    Library(int noOfBooks)
   {
    this.book = new String[noOfBooks];
    noOfBooks = 0 ;
   } 
   void addBook(String book)
   {
    this.book[noOfBooks] = book ;
    noOfBooks++;
    //System.out.println(book + " has been added");
   }
   void showavaibleBooks()
   {
     System.out.println("Available Books are...");
    for(String book : this.book)
    {
        if(  book == null)
        {
            continue;
        }
    
        System.out.println("* "+book);
    }
   }

   void issueBook(String book)
   { 
    for(int i=0 ; i<this.book.length ; i++)
    {
      if(this.book[i].equals(book))
      {
       System.out.println(this.book[i]+" book has been issued");
       this.book[i] = null ; 
       return;
      }
    }
    System.out.println(" The book doesnt exist");
}


   void returnBook(String book)
   {
    noOfBooks++;
    addBook(book);
   }

}
public class Student_Library {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library centrLibrary = new Library(5);
        centrLibrary.addBook("Electrical Machine");
        centrLibrary.addBook("Python");
        centrLibrary.addBook("Java and OOPS Concepts");
        centrLibrary.addBook("Elon Musk");
        centrLibrary.addBook("DSA");

         centrLibrary.showavaibleBooks();
         System.out.println("Enter the book you want to issue");
         String name = sc.nextLine();
         centrLibrary.issueBook(name);

         System.out.println("Do you want to return or add");
         String name1 = sc.nextLine();

        if(name1.equals("yes"))
         {
         System.out.println("Add book");
         String name2 = sc.nextLine();
         centrLibrary.returnBook(name2);
         }

         else
         {
           System.out.println("Thank you for visiting Central Library");
         }

         centrLibrary.showavaibleBooks();


         sc.close();
    }
    
}
