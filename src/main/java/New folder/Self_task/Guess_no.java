import java.util.Random;
import java.util.Scanner;

class Game
{
     int compNo ;
     int youNumber ;
     int noOfguess=0;

Game()
{
    Random rand = new Random();
    compNo = rand.nextInt(1,100);
}
public void takeUserinput()
{   
    System.out.println("Enter the number between 0 and 10");
    Scanner sc = new Scanner(System.in);
    youNumber = sc.nextInt();
    if(compNo==youNumber)
    {
        sc.close();
    }

}
public void setNoOfGuess(int num)
{
   noOfguess = num;
}
public int  getNoOfGuess()
{
    return noOfguess;
}
public boolean isCorrectNo()
{
    noOfguess++;

    if(compNo==youNumber)
    {
        System.out.printf("You won ! Number was %d and you guessed in %d attempt " , compNo,noOfguess);
        return true;
    }
    else if(compNo>youNumber)
    {
        System.out.println("Enter the high number ");
        }
    else if(compNo<youNumber)
    {
        System.out.println("Enter the  low number");
         
    }
    return false;
    
}

    
}
public class Guess_no {
    public static void main(String[] args) {

       Game player1 = new Game();
       boolean b = false;
       while(!b)
       {
           player1.takeUserinput();
           b=player1.isCorrectNo();
           
       }
      
       

        
    }
    
}
