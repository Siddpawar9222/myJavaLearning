package G_OOPS.Static;

public class StaticBlock {
	
	//static int a = m1() ;     //Try without static
	  
	{
		System.out.println("This is non static block");
	}
	
     static {
		System.out.println("This is static block");
	 }  
     
     static int m1() {
         System.out.println("from m1");
         return 20;
     }
      

	public static void main(String[] args) {
	   
       // Basic b = new Basic();        
	}

}
// When class is load, static block and static variable will execute(static belongs to class)
// when object reference is created , non-static block will execute
//static block and static variables are executed in the order they are present in a program.