import java.util.*;
class boo{  
void issueBook(String name)
{
    for(String key :bookData.keySet() )
    {
        if(key.equals(name))
        {
            System.out.println(key +"book has been issued");
            bookData.remove(key);
        }
    }
    System.out.println("The book doesnt exit");

}
}
public class rough {
    public static void main(String[] args) {

    //     LinkedHashMap<String,String> bookData = new LinkedHashMap<>(45);
    //     bookData.put("GOT", "US");
    //     bookData.put("AOT", "Japan");
    //     bookData.put("Dark", "German");
    //     //System.out.println("The key values pair is "+bookData.entrySet());

    // System.out.println(bookData.keySet());
    //     int i = 0 ;
    //    for(String key : bookData.keySet() )
    //    {
    //     i++;
    //     System.out.println(i +"  " +key +" " + bookData.get(key));

    //    }

        
    }
    
}
