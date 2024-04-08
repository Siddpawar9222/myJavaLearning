package D_Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Non_Reapeated {
	public static void main(String[] args) {
//        int arr [] ={1,2,3,4,5,2,3,10,6 };
//        ArrayList<Integer> arr1 = new ArrayList<>() ;
        // int count ;
        //  for(int i=0 ; i<arr.length  ; i++)
        // {
        //     count=0 ;
        //     for(int j= 0 ; j<arr.length ; j++){
        //         if(arr[i]==arr[j]   && i!=j){
        //             count++ ;
        //         }
        //     }
        //     if(count==0){
        //         System.out.println(arr[i]);
        //     }
        // }

//        for(int i=0 ;i<arr.length ; i++){
//            arr1.add(arr[i]);
//        }
//
//          for(int i=0; i<arr1.size()-1 ; i++){
//            for(int j=i+1; j<arr1.size() ; j++){
//                if(arr1.get(i)==arr1.get(j)){
//                    arr1.remove(j) ;
//            }
//            }
//          }   
//          System.out.println(Arrays.toString(arr));
//          System.out.println(arr1);
 
		
//Particular element is present or not		
        String[] inputArray = new String[]{"D","H","B","R"};
        boolean flag=false ;
      for(int i=0 ;i<inputArray.length ; i++){
    	  
         if(inputArray[i].equalsIgnoreCase("d"))
        		 {
        	 flag = true ;
         }
  }    
        if(flag==true) {
        	System.out.println("Present");
        }
        else {
        	System.out.println("Absent");
        }
       }
}
