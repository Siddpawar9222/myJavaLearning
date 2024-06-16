package J_Multithreading;

class MyVlc extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.print(" myVlc" + i);
        }
    }
}

class MyPot implements Runnable{

    @Override
    public void run() {
        
        for (int i = 0; i < 10; i++) {
            System.out.print(" myPot" + i);
        }
    }
    
}

public class A_Practice {
    public static void main(String[] args) {
        MyVlc m = new MyVlc() ;
        m.start();

    //    MyPot mp = new MyPot() ;
    //    Thread t = new Thread(mp) ;
    //    t.start() ;

       Runnable ru = ()->{
         for (int i = 0; i < 10; i++) {
            System.out.print(" myPot" + i);
        }
       } ;
    Thread t = new Thread(ru) ;
       t.start() ;
    }
}
