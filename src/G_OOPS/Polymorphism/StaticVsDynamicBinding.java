package G_OOPS.Polymorphism;

class DomesticAnimal{
	public void eat() {
		System.out.println("Animal is eatiing...");
	}
}


class Cow extends DomesticAnimal{
	 @Override
	  public void eat() {
		  System.out.println("Cow is eating....");
	  }
}


public class StaticVsDynamicBinding {

	public static void main(String[] args) {
	
		Cow d = new Cow();
		d.eat();    //static binding
		
		DomesticAnimal da = new Cow();
		da.eat();    //dynamic binding
		

	}

}
//1}Static/compile/early binding :
//When type of the object is determined at compiled time(by the compiler), it is known as static binding.
//If there is any private, final or static method in a class, there is static binding.


//2}Dynamic/runtime/late binding :
//When type of the object is determined at run-time, it is known as dynamic binding.
//In the above example object type cannot be determined by the compiler, because the instance of Cow is also an instance of DomesticAnimal. So compiler doesn't know its type, only its base type.