package Custom_Calculator;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.naming.LimitExceededException;
class MyException
{
    int x,y;
    public void setinputByuser()
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the two number");
         try{
             int a =sc.nextInt();
             int b =sc.nextInt();
             if(a>100000 || b>100000)
             {
                try {
                    throw new LimitExceededException("Maximum limit of any of number");
                } catch (LimitExceededException e) {
                System.out.println(e.getMessage());  
            }finally
            {
                sc.close();
                System.exit(0);          
                }
             }
             x=a;
             y=b;
         }
         catch(InputMismatchException e)
         {
            System.out.println("Invalid input");
            System.exit(0);
         }

    }
    public int getinputByuserX()
    {
        return x;
    }
    public int getinputByuserY()
    {
        return y;
    }
    
}

public class Custom_Calculator {
    public static void main(String[] args) {
        MyException m = new MyException();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which operation do you want to perform.....\n 1)Addition\n 2)Substraction\n 3)Multiplication\n 4)Division ");
        int userChoose = sc.nextInt();
        
        if(userChoose==1)
        {
            m.setinputByuser();
            System.out.println("Addition of two numbers is  " + (m.getinputByuserX() + m. getinputByuserY()));
        }
        else if(userChoose==2)
        {
            m.setinputByuser();
            System.out.println("Subtraction of two numbers is  " + (m.getinputByuserX()-m.getinputByuserY()));
        }
        else if(userChoose==3)
        {
            m.setinputByuser();
            try
            {
                if(m.getinputByuserX()>7000 || m.getinputByuserY()>7000)
                {
                    throw new LimitExceededException("one of the number is greather than 7000 which is not allowable");
                }
            }
            catch(LimitExceededException e)
            {
                System.out.println(e.getMessage());
                System.exit(0);
            }
            finally
            {
                sc.close();
            }
            System.out.println("Multiplication of two numbers is  " + (m.getinputByuserX()*m.getinputByuserY()));
        }
        else if(userChoose==4)
        {
            m.setinputByuser();
            if(m.getinputByuserY()==0)
            {
                try {
                    throw new Exception("Cannot divide by zero");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                finally
            {
                sc.close();
            }
            }
            else {
            System.out.println("Division of two numbers is  " + (m.getinputByuserX()/m.getinputByuserY()));
            }
        }

       
    }
}
