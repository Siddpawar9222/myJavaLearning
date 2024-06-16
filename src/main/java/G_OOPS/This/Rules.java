package G_OOPS.This ;

//this - this means instance of current class(return instance of current class)
//Rules :

/*
1)invoke current class instance variable
2)invoke current class method(implicitly) e.g. this.m4() == m4()
3)used to invoke current class constructor(constructor chaining)
4)Pass an argument in a method call 
5)Pass an argument in constructor call 
6)Return the current class instance from the method 
*/

class ThisDemo{ 
	int id ;

	ThisDemo(){
		System.out.println("Constructor with zero parameter executed " + id);
	}
	
	ThisDemo(int id){
		this();      //constructor chaining
		this.id =id ;
		System.out.println("Constructor with one parameter executed " + id);
	}



	void m1(ThisDemo d1) {
		System.out.println("This is m1 " + d1);
	}

	void m2() {
		m1(this) ;
	}                   //4)(same for 5) )
	
	ThisDemo m3() {
		return this ;
	}                   //6)
	
	
	void m4() {
		System.out.println("This is m4");
	} 
	
	void m5() {
		this.m4();   //Equals to m4()
	} 
	

}

public class Rules{
	public static void main(String[] args) {
		ThisDemo d = new ThisDemo(200);
		//d.m2();
	}
}