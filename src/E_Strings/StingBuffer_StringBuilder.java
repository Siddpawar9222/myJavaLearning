package E_Strings;

public class StingBuffer_StringBuilder {

	public static void main(String[] args) {
		
//     StringBuffer sb = new StringBuffer("Siddhesh ") ;
//     sb.append("Pawar") ;
//     sb.insert(2, "s") ;
//     sb.replace(1, 3, "kkk");        //beginIndex and endIndex-1.
//     sb.delete(5, 10);
//     sb.length();
//     sb.reverse();    
//     System.out.println(sb);
     
 //----------------------------------------
     
//     StringBuffer sb1 = new StringBuffer();
//     System.out.println(sb1.capacity()); // default 16
//     sb1.append("Hello");
//     System.out.println(sb1.capacity()); // now 16
//     sb1.append("java is my favourite language");
//     System.out.println(sb1.capacity());
     // Now (16*2)+2=34     i.e (oldcapacity*2)+2
//The capacity() method of StringBuffer class returns the current capacity of the buffer. The default capacity of the buffer is 16. If the number of character increases from its current capacity, it increases the capacity by (oldcapacity*2)+2.
//     For example if your current capacity is 16, it will be (16*2)+2=34.
    
//--------------------------------------------------------------------------------
     
//     StringBuilder str = new StringBuilder();
//     System.out.println(str.capacity());
//     str.append("Hy");
//     System.out.println(str);
     //Same method like string buffer 
     //Methods of string also work in string buffer and string builder 
     
     
	}

}
