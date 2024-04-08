package D_Array;

import java.util.Arrays;

import java.util.Scanner;

public class A_Basic {
	public static void main(String[] args) {

//    	int [] arr = new int [5] ;
//    	System.out.println(Arrays.toString(arr));
		// If we dont declare arr , the it will gives output of its default datatype 
		
//		Data Type                            Default value
//		byte, short, int, long                   0
//		float, double                           0.0
//		boolean                                false
//		Any object                              null


//    	String [] arr1 = new String [5] ;  //All    null values
//    	System.out.println(Arrays.toString(arr1));

		// Array index should be +ve interger only

//	    int [] ar = new int [5] ;
//	    ar = {1,2,3,4,5} ;   // Arrays constant can be initized as cnstant
		// We can do like this
//-----------------------------------------------------    	
		// 1D array

//         int[] marks = { 56 , 89 , 45 , 36, 95  };
//         
//         for(int i=0 ; i<marks.length ; i++)
//         {
//              System.out.println(marks[i]);
//         }
//            
//          System.out.println("Using For each loop");
//          
//          for(int element : marks) {
//        	  System.out.println(element);
//          }

//-----------------------------------------------------------
//          System.out.println("Taking User input");
//          Scanner scanner = new Scanner(System.in);
//          int [] arr2 = new int [4] ;
//          for(int i =0 ; i<arr2.length ; i++) {
//        	  arr2[i] = scanner.nextInt() ;
//          }
//          
//               System.out.println(Arrays.toString(arr2));

//-----------------------------------------------------------          
		// 2D array

//		int[][] arr4 = { { 1, 2, 3 }, { 4, 5, 5 } };
//		for (int i = 0; i < arr4.length; i++) {
//			for (int j = 0; j < 3; j++) {
//				System.out.print(arr4[i][j] + " ");
//			}
//			System.out.println();
//		}

//          System.out.println("Taking User input");
//          Scanner scanner = new Scanner(System.in);
//          int arr5[][] = new int[3][5] ;
//          
//           for (int i=0 ; i<arr5.length ; i++)
//           {
//               for (int j=0 ; j<arr5[0].length ; j++)
//               {
//                   arr5[i][j] = scanner.nextInt();
//               }
//           }
//            

//           for(int i=0 ; i<arr5.length ; i++) {
//          	 for(int j = 0 ; j< arr5[0].length ; j++) {
//          		 System.out.print(arr5[i][j] + " ");
//          	 }
//          	 System.out.println();
//          }
//           
//      int[][] myNumbers = { {1, 2, 3,4}, {5, 6, 7} ;  //It will give me exception    

//        scanner.close();

//Practice

//    Scanner sc = new Scanner(System.in) ;
//    int a [][] = new int[3][2];

//    for(int i= 0 ; i< a.length ; i++){
// 	for(int j=0 ; j< a[0].length; j++){
// 		a[i][j] = sc.nextInt() ;
// 	}
//    }
//     for(int row[] : a ){
//       for (int element : row ) {
// 		   System.out.print(element + " ");
// 	  }
// 	  System.out.println();
// 	}

	
     
	int arr[][] = {{1,2,3} ,{4,5} ,{6,7,8,9,10} }  ;

	//  for(int row[] : arr ){
    //   for (int element : row ) {
	// 	   System.out.print(element + " ");
	//   }
	//   System.out.println();
	// }

	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
		     System.out.print(arr[i][j] + " ");	
		}
		System.out.println();
	}


	
      
}
}

