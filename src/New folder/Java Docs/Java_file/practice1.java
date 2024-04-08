import java.io.File;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

// class Ss
// {
//     @Deprecated
//     public void m2()
//     {
//         System.out.println("No way");
//     }
// }
// public class practice1 {
//     public static void main(String[] args) {
//       @SuppressWarnings("Deprecated")
//        Ss s = new Ss();
//        s.m2();
        
//     }
    
// }

// @FunctionalInterface
// interface  MM
// {
//     void  sp(int a);
// }
// public class practice1{

//     public static void main(String[] args) {

//         // MM d = new MM() {

//         //     @Override
//         //     public void sp(int a) {
//         //         System.out.println("hii " + a);
//         //       }
//         //     };
//         //     d.sp(5);
      
//     }
// }

// public class practice1
// {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
        
//         try {
//             FileWriter w = new FileWriter("D:\\Destop\\Coding\\Java_Project\\Java Docs\\Java_file\\Multi_table\\multitable.txt");
//             for(int i=1 ; i<=10 ; i++)
//             {
//                 w.write(a+"X"+i +"="+ a*i +"\n");

//             }
//             w.close();
//         } catch (IOException e) {
//             System.out.println("Unable to write");
            
//         }
//         sc.close();
//     }
// }

public class practice1
{
    public static void main(String[] args) {

        for (int i = 2; i <= 9  ; i++) {
            try {
                FileWriter wk = new FileWriter("D:\\Destop\\Coding\\Java_Project\\Java Docs\\Java_file\\Multi_table\\multiplication_table_of_"+i+ ".txt");
                 for(int j =1 ; j<=10 ; j++)
                 {
                   wk.write(i+"X"+j +"="+ (i*j)+ "\n" );
                 } 
                 wk.close();
            }
            catch (IOException e) {
                    System.out.println("Error occurd");
                   
             }
            
        }
        
    }
}
