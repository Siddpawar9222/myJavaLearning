package Libray_managment_system;
import java.util.*;
import java.util.Map.Entry;

class Library{

    LinkedHashMap<String,String> bookData = new LinkedHashMap<>(150);
    Library()
    {
        bookData.put("GOT", "US");
        bookData.put("AOT", "Japan");
        bookData.put("Dark", "German");
        bookData.put("Stranger things", "US");
    }

     void showavaibleBooks()
    {
        System.out.println("Available books are....");
        for(String key : bookData.keySet())
        {
            System.out.println(key + " Author name : " +bookData.get(key));
        }
    }
      
    void issueBook(String name)
    {
       
        Iterator<Entry<String, String>> it = bookData.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().equalsIgnoreCase(name)){
                it.remove();
                System.out.println("The book has been issued");
                 return ;
            }
        }
            System.out.println("Book not found");
  }

  void addBook(String bookName , String author)
  {
    bookData.put(bookName , author);
  }


        
}


public class MyLibraryFinal {
    public static void main(String[] args) {
        Library l = new Library();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Central Library\n Here some available option for you .Please choose it");
        boolean flag=true;
        while(flag==true)
        { 
           System.out.println(" Press 1 for  Show Availabe Books\n Press 2 for issue book\n Press 3 for retured book\n Press 4 to add book\n Press 5 to Quiet");
        int youOption =sc.nextInt();
        if(youOption==1)
        {
            l.showavaibleBooks();
        }
        else if(youOption==2)
        {
            System.out.println("Enter the book name");
            String n = sc.nextLine() + sc.nextLine();
             l.issueBook(n);
            
        }
        else if(youOption==3)
        {
            System.out.println("Enter the book you want to return and author name also");
            String m = sc.nextLine() + sc.nextLine() ;
            String n = sc.nextLine()  ; 
             l.addBook(m, n);
            
        }
        else if(youOption==4)
        {
            System.out.println("Enter the book you want to add and author name also");
            String m = sc.nextLine() + sc.nextLine() ;
            String n = sc.nextLine()  ; 
             l.addBook(m, n);
            
        }
        else if(youOption==5)
        {
            System.exit(0);
        }
    }
        
        sc.close();
        
    }
    
}
