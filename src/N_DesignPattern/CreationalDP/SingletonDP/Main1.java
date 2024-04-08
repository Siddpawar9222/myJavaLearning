package N_DesignPattern.CreationalDP.SingletonDP;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Main1 {
    public static void main(String[] args) throws Exception {
        GovernmentOffice2 go1 = GovernmentOffice2.getgovernmentOffice2();

        // 1. Reflection api
        // Constructor<GovernmentOffice2> constructor =
        // GovernmentOffice2.class.getDeclaredConstructor();
        // constructor.setAccessible(true); // without this line gives error
        // GovernmentOffice2 go2 = constructor.newInstance();
        // System.out.println("go1 == go2 ? " + (go1==go2)); // false

        // =======================================================================//

        // 2. Deserialization

        // ObjectOutputStream oos = new ObjectOutputStream(
        //         new FileOutputStream("./MyJavaLearning/src/N_DesignPattern/CreationalDP/SingletonDP/abc.op"));
        // oos.writeObject(go1);
        // System.out.println("Serialization Done....");

        // ObjectInputStream ois = new ObjectInputStream(
        //         new FileInputStream("./MyJavaLearning/src/N_DesignPattern/CreationalDP/SingletonDP/abc.op"));
        // GovernmentOffice2 go2 = (GovernmentOffice2) ois.readObject();

        // System.out.println("go1 == go2 ? " + (go1 == go2)); // false

        //================================================================//

          GovernmentOffice2 gOffice =  (GovernmentOffice2)go1.clone();
          System.out.println("go1 == gOffice ? " + (go1 == gOffice)); // false

    }
}
/*
 * Ways to break to singleton pattern :
 * Break means we can create muttiple instance of singleton class.
 * 1. Reflection api
 * How to avoid ?
 * 1. Add this code in constructor
 * if(governmentOffice!=null){
 * throw new
 * RuntimeException("You cannot create instace of class , it already exist...")
 * ;
 * }
 * 2. Create enum of class
 * 
 * 2. Deserialization
 *  How to avoid ? 
 *    Add this method in class
 *    public Object readResolve(){
        return governmentOffice2 ;
       }
 * 
   3 .clone() method 
   How to avoid ? 
      @Override
    protected Object clone() throws CloneNotSupportedException {
        return governmentOffice2;    
    }
 * 
 */