package B_Operators_Associtivity ;

// a b c d --> 8 4 2 1  -->Sum must be 15

public class Bitwise_Operators {

	public static void main(String[] args) {
	   	byte val1 = 12 ;  //0000 1100
	   	byte val2 = 10 ;  //0000 1010
	   	byte result ;
	   	
	   // bitwise complement of val1
	   result = (byte) ~val1;  
      System.out.println("The result is " + result);
      //12 = 8 + 4 =  0000 1100 = ~(0000 1100) = 1111 0011 = -(0000 1100 + 1 ) = -(12+1)=  -13
      //                                          As 1 denotes -ve no = need 2s complements(1s complements + 1 )
      //bitwise AND operation
      result = (byte) (val1 & val2);
      System.out.println("The result is " + result);
      
    //bitwise OR operation
      result = (byte) (val1 | val2);
      System.out.println("The result is " + result);
      
    //bitwise XOR(eXclusive OR) operation  // XOR different input give 1 and same input give give 0
      result = (byte) (val1 ^ val2);
      System.out.println("The result is " + result);
      
      //Shifting 2 bits to the left
      //When shifting left, the most-significant bit is lost, and a 00 bit is inserted on the other end
      result = (byte) (val1 << 2  );
      System.out.println("The result is " + result);
      // 0000 1100 << 2 = 0011 0000 = 32 + 16 = 48
      
      
     //Shifting 2 bits to the right
     //When shifting right with an arithmetic right shift, the least-significant bit is lost and the most-  significant bit is copied
      //If a number is encoded using two's complement, then an arithmetic right shift preserves the number's          
      //sign, while a logical right shift makes the number positive.
      result = (byte) (val1 >> 2  );
      System.out.println("The result is " + result);
      // 0000 1100 >> 2 =  0000 0011  = 0 + 2 + 1  = 3 
      
      result = (byte) (3 >>2 );
      System.out.println(result);
      
      result =(byte)(-11>>3);  
      System.out.println(result);
      // 11 = 1011>>3 = 1111 = (0000 + 1 ) = 1 
      // visit the link(IMP) --->   https://www.interviewcake.com/concept/java/bit-shift
      
      //                           https://www.futurelearn.com/info/courses/maths-puzzles/0/steps/14000
      
      
	} 

}