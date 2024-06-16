package B_Operators_Associtivity;
//IMP
//Increment means  a++ or ++a
//This means a = a+1 ;  (It is Exactly not same )

public class Increment_Decrement {
    public static void main(String[] args)
    {
//        char a= 'a';
//        System.out.println(a++);
//        System.out.println(a);
//        System.out.println(a+1);
 
//--------------------------------------------------------------------------    	
    	int a =10 ;
    	System.out.println(++a);
    	System.out.println(a); 
    	
    	int a1 =10 ;
    	System.out.println(a1++);
    	System.out.println(a1); 
    	
 //-----------------------------------------------------------------------
    	
    	int k =10 ;
		if(k++>10) {
			System.out.println("Done " + k);
		}
		System.out.println("Not Done " + k);
        
    }
    
}
