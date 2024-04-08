public class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
           int zeroCount = 0 ; 
           int oneCount = 0 ; 
           int i =0 ;
           int n = sandwiches.length;
           for(int student : students){
              if(student==0){
                zeroCount ++ ;
              }else{
                 oneCount++ ;
              }
           }
           
           while (i<n) {
              if(sandwiches[i]==0 && zeroCount!=0){
                  i++ ; 
                  zeroCount-- ;
              }else if(sandwiches[i]==1 && oneCount!=0){
                  i++ ; 
                  oneCount-- ;
              }else{
                 return n - i ;
              }
           }
        
           return 0 ;
    }

    public static void main(String[] args) {
       
    } 
}
