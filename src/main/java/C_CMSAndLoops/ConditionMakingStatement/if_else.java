package C_CMSAndLoops.ConditionMakingStatement;

import java.util.Scanner;
public class if_else {
    public static void main(String[] args)
    {
   //   System.out.println("Entered the value beteween 0 to 127");
   //   Scanner sc = new Scanner(System.in);
   //   byte a = sc.nextByte();
   //   System.out.printf("You Entered : %d \n",a);
     
     

   //   if(a > 0 && a<=18)
   //   {
   //      System.out.println("You belong to Children and teenager group");
   //   }
   //   else if(a>18 && a<=50)
   //   {
   //      System.out.println("You belong to adult group");
   //   }
   //  else
   //   {
   //      System.out.println("You belong to Older adult Categories");
   //   }
   //   sc.close();

        
        System.out.println("Enter tab");
        Scanner sc = new Scanner(System.in);
        char s = sc.nextLine().charAt(0);
        System.out.println(s);
        if(Character.isWhitespace(s))
        {
         System.out.println("You are right");
        }
        else
        {
         System.out.println("You are wrong");
        }
        sc.close();
    }
    
}
