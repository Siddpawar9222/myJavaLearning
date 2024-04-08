package G_OOPS.Super;

//super : instance of immediate parent class
class A {

	int i = 10;
	
	public A(int i) {
		System.out.println("This is A's constructor");
	}
	
	void show(int i) {
		System.out.println("This is A class show method " + i);
	}
	
}

class B extends A {
	public B(int i) {
	   super(i) ;
	}

	int i = 20;

	void show(int i) {
		System.out.println(i);	
		System.out.println(this.i);
		System.out.println(super.i);
        super.show(i);
	}

}

public class Rules {

	public static void main(String[] args) {
		B b = new B(45);
		b.show(50);

	}

}
//this --> B b = new B()   so this=b
//super --> A a = new A()  so super=a