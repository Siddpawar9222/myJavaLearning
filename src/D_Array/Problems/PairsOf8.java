package D_Array;

public class PairsOf8 {
    public static void main(String[] args) {
        int arr  [] = { 3 , 1 , 6 , 2 , 5 , 7 , 9  } ;
        for(int i=0 ; i<arr.length -1 ; i++)
        {
            for(int j= i + 1 ; j<arr.length ; j++){
                if (arr[i] + arr[j]==8) {
                    System.out.println(arr[i] +"," + arr[j] + "=" +  "8" );
                }
             }
        }
    }

}
