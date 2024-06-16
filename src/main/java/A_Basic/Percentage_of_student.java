package A_Basic;

import java.util.Scanner;
public class Percentage_of_student{
       public static void main(String[] args)
       {
          System.out.println("Im going to calculate percentage of CBSC students");
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the marks of marathi subject :");
          byte m= sc.nextByte();
          System.out.println("Enter the marks of Hindi subject :");
          byte h= sc.nextByte();
          System.out.println("Enter the marks of English subject :");
          byte e= sc.nextByte();
          System.out.println("Enter the marks of Science subject :");
          byte s= sc.nextByte();
          System.out.println("Enter the marks of Maths subject :");
          byte mt= sc.nextByte();
          //int avg = m+h+e+s+mt / 500 ;
          float per = ( (m+h+e+s+mt) / 500.f) * 100 ;
          System.out.println("Percentage of Student is : ");
          System.out.println(per);
          sc.close();
          
       }

}