package G_OOPS.Setters_Getters;

/* 
The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:
	-declare class variables/attributes as private
	-provide public get and set methods to access and update the value of a private variable

private variables can only be accessed within the same class (an outside class has no access to it). However, it is possible to access them if we provide public get and set methods.
The get method returns the variable value, and the set method sets the value.
Syntax for both is that they start with either get or set, followed by the name of the variable, with the first letter in upper case:
*/
class Example {
	private String name;
	private int id;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

}

public class Setters_Getters {

	public static void main(String[] args) {

		Example eg = new Example();

		// eg.name ="Siddhesh" ; //I cant do this because name is private

		eg.setName("Siddhesh Pawar");
		System.out.println(eg.getName());

		eg.setId(22);
		System.out.println(eg.getId());
         
		
	}

}
