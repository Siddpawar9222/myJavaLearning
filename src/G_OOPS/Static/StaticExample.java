package G_OOPS.Static;

class Counter {
	static int a = 0;  //*
	int b = 0;

  	void counterIncrement() {
		a++;
		b++;
		System.out.println("Value of a is " + a  +" and " + "Value of b is " + b);
	}
}

public class StaticExample {
	static int change = 0;

    static void m1(){
		System.out.println(change);
	}
	public static void main(String[] args) {
		change = 110;
		StaticExample.m1() ;
		System.out.println(change);
		Counter s1 = new Counter();
		Counter s2 = new Counter();
		System.out.println();
		s1.counterIncrement();
		s2.counterIncrement();

	}

}
//*-->We can create static variables at the class level only