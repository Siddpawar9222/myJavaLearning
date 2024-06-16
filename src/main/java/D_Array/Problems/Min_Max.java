package D_Array;
import java.util.* ;
public class Min_Max {
    public static void main(String[] args) {
         int arr[] = {31 , 8 , 7 ,24 , 114 ,3 } ;
        
         
         
         int min_num=Integer.MAX_VALUE ;
         int max_value =Integer.MIN_VALUE ;
         for(int i=0 ; i<arr.length ; i++){
             if(arr[i]<min_num){
                 min_num=arr[i] ;
             }
            
             if(arr[i]>max_value)
             {
                 max_value=arr[i];
             }

         }
         System.out.println("Minimum value is " + min_num  + " and Maximum value is " + max_value);
    
//        int [] arr ={ 15 , 8 , 9 , 2 ,11 , 4  };
//        int n = arr.length;
//        int temp ;
//        for(int i= 0 ; i<n/2; i++)
//        {
//            temp = arr[i] ;
//            arr[i] = arr[n-1-i] ;
//            arr[n-1-i] = temp ;
//        }
//      
//        //  for(int i= 0 ; i<n ; i++){
//        //     System.out.print(arr[i] + " ");
//        //  }
//
//        System.out.println(Arrays.toString(arr));
        
    }
    
}
