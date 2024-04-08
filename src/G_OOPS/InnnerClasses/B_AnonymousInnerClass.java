package G_OOPS.InnnerClasses;

//Suppose I want to change the behavior of particular class method how can I do it.
//Here is one method----->
class AB{
	public void run() {
		System.out.println("Lets run..");
	}
}
class ABC extends AB{
	@Override
	public void run() {
		System.out.println("Lets run.. in ABC");
	}
}
public class B_AnonymousInnerClass {

	public static void main(String[] args) {
      ABC a = new ABC();
      a.run();
	  //Here I changed the behavior of run method which is present in class AB .what if I need this technique only once in my program . For this problem  I created separate class which is not a good method or practice . 
      
      //-----------------------------------------//
      //Anonymous Inner Class
      AB b = new AB() {
    	  public void run() {
    			System.out.println("Lets run.. in AnonymousInnerClass");
    		}
      
	};
	b.run();

  }
}
