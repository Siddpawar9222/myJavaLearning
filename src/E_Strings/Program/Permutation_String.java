package E_Strings.Program;

public class Permutation_String {
	public static void permutation(String str , int l , int r) {
		if(l==r) {  
			System.out.println(str);
		}
		else {
			for(int i= l ; i<=r; i++) {
				  str= swap(str, l, i);
				  permutation(str, l+1, r);
				  str = swap(str, l, i);   //To recover the original string(BackTracking)
				 }
		}
		
		 
	}
    public static String swap(String a , int i , int j) {
    	     char[] charArry    = a.toCharArray();
    	     char temp ;
    	     temp = charArry[i];
    	     charArry[i] = charArry[j];
    	     charArry[j] = temp ;
    	     
    	return  (String.valueOf(charArry)) ;
    }
	public static void main(String[] args) {
		  String name = "ABC" ;
		  permutation(name , 0 , name.length()-1);

	}

}
