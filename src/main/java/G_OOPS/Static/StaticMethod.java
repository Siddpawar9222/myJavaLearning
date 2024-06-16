/*
Rules :
They can only directly call other static methods.
They can only directly access static data.
They cannot refer to this or super in any way.
*/


package G_OOPS.Static;

public class StaticMethod {
	static int a = 10;
	int b = 20;

	static void m1() {
		System.out.println("from m1 ");
	}
	
	void m2() {
	   System.out.println("from m2 "+ a);
	}
	
    void testIt(){
      a =500 ;
	  b=1000;
	  m2();
	  m1();
	}

	static void testItStatic(){
      a =500 ;
	  //b=1000;
	  //m2();
	  m1();
	  //System.out.println(this.b);
	}

	public static void main(String[] args) {

	}
}
/*
  Non-static variable or method can be access only within Non-static method.
  Static variable or method can be access within both static as well as non-static.
 */