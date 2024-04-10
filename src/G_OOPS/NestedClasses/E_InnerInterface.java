package G_OOPS.NestedClasses;
 class Test{
    protected interface Yes{
		void show();
	}
  /* 
   // for private interface Yes
   class AB implements Yes{

	@Override
	public void show() {
		
	}
	*/
	   
   }

class Testing implements Test.Yes{

	@Override
	public void show() {
	System.out.println("This is show");
		
	}
 
}

interface Xyz{
	
	interface InnerDemo{
		int MIN =10 ;
		void show();
	}
}

class TestingAgain implements Xyz.InnerDemo{

	@Override
	public void show() {
}
	
}
public class E_InnerInterface {

	public static void main(String[] args) {
	Testing t = new Testing();
	t.show();

	}

}
/*
A Nested Interface is implicitly public static. So the modifiers public static are redundant in declaration
the purpose of declaring an Inner interface is to restrict its access from outside world.

 */