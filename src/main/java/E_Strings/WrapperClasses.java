package E_Strings;

public class WrapperClasses {

	public static void main(String[] args) {
		//The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.
		
		
		Integer myInt = 10 ;
		Long myLong = 20L ;
		System.out.println(myInt);
		System.out.println(myLong);
		
		
//		Autoboxing
//
//		The automatic conversion of primitive data type into its corresponding wrapper class is known as autoboxing, for example, byte to Byte, char to Character, int to Integer, long to Long, float to Float, boolean to Boolean, double to Double, and short to Short.
//
//		Since Java 5, we do not need to use the valueOf() method of wrapper classes to convert the primitive into objects.
		
		//Converting int into Integer  
		int a=20;  
		Integer i=Integer.valueOf(a);//converting int into Integer explicitly  
		Integer j=a; //autoboxing, now compiler will write Integer.valueOf(a) internally  
		System.out.println(a + " " +i + " " + j );
//------------------------------------------------------------------------------------
		
		
//		Unboxing
//
//		The automatic conversion of wrapper type into its corresponding primitive type is known as unboxing. It is the reverse process of autoboxing. Since Java 5, we do not need to use the intValue() method of wrapper classes to convert the wrapper type into primitives. 
        
		//Converting Integer to int    
		Integer a1=new Integer(3);    
		int i1=a1.intValue();  //converting Integer to int explicitly  
		int j1=a1;//unboxing, now compiler will write a.intValue() inter1nally    
		    
		System.out.println(a1+" "+i1+" "+j1); 
//------------------------------------------------------------------------------------
		
		
		
		//toString() method, which is used to convert wrapper objects to strings.
		Integer k = 14 ;
		String myString = k.toString();
		System.out.println(myString.length());
		
//--------------------------------------------------------------//
		 System.out.println();
		 
		int z = 1012 ;
		Integer s = new Integer(z) ;
		System.out.println(s);         //AutoBoxing
		System.out.println(s.getClass().getName());
		
		Double d = new Double(1.023);
		double du = d ;
		System.out.println(du);
		//System.out.println(du.getClass().getName()); //Not Working
		Object o = (Object)du ;          //downcasting
		System.out.println(o.getClass().getName());
		
		
		
		
	}

}
