package D_Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Interview {
	public static int Sum(int [] arr) {
		int sum= 0 ;
		for( int elements : arr) {
			sum += elements ;
		}
		return  sum;
	}

	public static void main(String[] args) {

//		Object[] str = new String[5];
//		str[0] = new Integer(0);
		// It will give Exception ArrayStoreException 
		
		
//		ArrayStoreException is thrown if you are trying to add incompatible data type. For example, if you try to add an integer object to String Array, then ArrayStoreException is thrown.
//
//		ArrayOutOfBoundsException is thrown when an attempt is made to access the Array with illegal index. For example, illegal index means if the index is either negative or greater than or equal to the size of the Array.
 //----------------------------------------------------------------------------
	//	 System.out.println(Sum(new int[] {1, 2 , 3 ,4})); //Anonymous Array
  // -----------------------------------------------------------------------
	  //Intersection of Array	 
		 
		 int[]  arr1 = {1, 2, 3, 4, 6};
		 int[] arr2 = {2, 3, 4, 7, 4};	 
		 
		 ArrayList<Integer> arr3 = new ArrayList<>() ;
		 for(int i=0 ;i<arr1.length ;i++) {
			 for(int j=0 ;j<arr2.length ; j++) {
				 if(arr1[i]==arr2[j]) {
					//System.out.print(arr1[i]+" "); 
					 arr3.add(arr1[i]) ;
					 break;
				 }
			 }
		 }
		System.out.println(arr3);
	} 

}
