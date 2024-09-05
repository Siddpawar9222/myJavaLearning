package J_Multithreading;

class ThreadInterrupt extends Thread {
	@Override
	public void run() {
		try {
             //System.out.println(Thread.currentThread().isInterrupted());
              System.out.println(Thread.interrupted());
              System.out.println(Thread.interrupted());
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
				Thread.sleep(1000);   //*
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

public class I_ThreadInterrupt {

	public static void main(String[] args) {
      ThreadInterrupt ti = new ThreadInterrupt();
      ti.start();
      ti.interrupt();
	  System.out.println("main thread is executed...");
	}

}
//* -->interrupt() only works if sleep or wait method is there.
//interrupted() -static method that checks whether the current thread has been interrupted and clears the interrupted status.
       //if true --> returns true--> Make interrupted status to false
       //if false ---> return false
//isInterrupted() - returns interrupted status