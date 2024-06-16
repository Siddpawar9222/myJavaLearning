import java.util.Random;
import java.util.Scanner;
public class rocks_Paper_Scissors {
    public static void game(int comp ,int you)
    {
      if(comp==you)
      {
        System.out.println("Game Tie ! Please try again");
        
      }
      else if((comp==1 && you==2) ||(comp==2 && you==3) ||(comp==3 && you==1))
      {
        System.out.println("You Won !");
      }
      else if((comp==2 && you==1) || (comp==3 && you==2) || (comp==1 && you==3))
      {
        System.out.println("You Loose !");
      }
    
    }
    public static void main(String[] args)
    {
         Random rand = new Random();
         Scanner sc = new Scanner(System.in);
         int comp = rand.nextInt(1,4);
         System.out.println("Enter 1 for Rocks , 2 for Paper and 3 for Scissors");
         int you = sc.nextInt();
         if(you==0 || you>3)
         {
            System.out.println("Invalid input ! Please Enter the number 1 , 2 or 3");
         }
         //System.out.println(you);
        // System.out.println(comp);
         game(comp,you);
            
         //randomcharator generator 
        //  Random rand = new Random();
        //  char comp  = (char)rand.nextInt(97,110);
        //  System.out.println(comp);
         sc.close();
    }
    
}
