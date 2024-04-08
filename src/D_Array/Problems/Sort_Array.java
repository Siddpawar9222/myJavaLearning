package D_Array;

import java.util.Arrays;

public class Sort_Array {
	public static int[] sortArray(int[] arr) {
		int temp = 0;
		for (int i = 0; i < (arr.length - 1); i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr;
	}

	public static void main(String[] args) {
//        int[] arr = { 5, 8, 2, 6, 9, 3 };
//        int [] arr1 = {3,9,6,2,8,5} ;
//        boolean flag = true ;
//        sortArray(arr);
//        System.out.println(Arrays.toString(arr));
//        if(arr.length == arr1.length) {
//
//        	sortArray(arr);
//        	sortArray(arr1);     //Here reference of array is passed
//        	for(int i=0 ; i<arr.length ; i++) {
//        		 if(arr[i] != arr1[i]) {
//        			  flag=false ;
//        			  break ;
//        		 }
//        	}
//        }else {
//        	flag=false ;
//        }
//    
//        
//        if(flag==true) {
//        	System.out.println("Equal");
//        }
//        else {
//        	System.out.println("Not Equal");
//        }

		// -------------------------------------------------------------------
		// Find the missing number in an Array in Java with Examples
//		 int[] in = {10,9,6,7,4,3,5,1,2} ;
//		 sortArray(in) ;
//		 int n = in[in.length-1] ;
//		 int sumofNumber = n*(n+1)/2 ;
//		 int sumofArray =0 ;
//       for(int element : in) {
//   	        sumofArray +=element ;
//        }

		//System.out.println("Missing number is " + (sumofNumber - sumofArray));
// How to find the missing number in an unsorted Array with duplicate elements
// Ans - Sort Array - Remove dublicate elements(Youtube Method)-Same procedure
		// as above
//-------------------------------------------------------------------------------		

//There are two arrays object one containing 100 elements and another containing 50 elements. Both are of same data type. Can we assign one Array to another Array.
		//Ans -------->
//		Yes,  an Array of 100 elements can be assigned to an Array of 50 elements in java. The only criteria is that both arrays of same data type. It is because at the time of assigning the values compiler looks for the data type of Array not the size of Array
		
		int[] arr = new int [100];
		int[] arr1 = new int [50];
		
		arr1 = arr ;
		System.out.println(arr.length);
		
             		
	}

}