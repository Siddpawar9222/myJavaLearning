package J_Multithreading;


public class G_Threadyield {

	public static void main(String[] args) {
		
		Runnable thread0 =()->{
			Thread.yield();  //It stops the current running thread(thread-0) and give chance to main method to executed the main thread
			for (int i = 0; i < 6; i++) {
				System.out.println(i + " : " + Thread.currentThread().getName() );
			}
		};
		Thread t =new Thread(thread0);
		t.start();
		
		
		for (int i = 0; i < 6; i++) {
			System.out.println(i + " : " + Thread.currentThread().getName() );
		}

	}

}
