package G_OOPS.InnnerClasses;

// If I want to use the abstract class I need to extend it then I can use. I cannot
// directly create object(instancetiate it) 
//Here is another method here
abstract class Demo{
	 public void demo() {
		System.out.println("Here is demo 1");
	  }
	  public abstract void demoA();
} 
public class AbstractAnonymousClass {
	
	public static void main(String[] args) {
		
	   Demo d = new Demo() {
		
		@Override
		public void demoA() {
	     }
		@Override
		public void demo() {
			System.out.println("In Anonymous class...");
		}
		
	};
	d.demo();

	}

}

//Same like Anonymous inner class concept
