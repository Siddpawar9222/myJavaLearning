package L_CollectionFramework;

public class VarKeyword {
     // var cannot be used for method parameters and return type.
	 
	// var method1() { return ("Inside Method1"); }
 
   
    // void method2(var a) { System.out.println(a); }

	public static void main(String[] args) {

		// We can declare any datatype with the var keyword.
		var a = 10;
		var b = "Siddhesh";

		System.out.println(a);
		System.out.println(b.getClass());

		// var cannot be used as a Generic type.
		// var<var> al = new ArrayList<>();

		// var cannot be used with Lambda Expression.
		

	}
	// var c = 10 ; //var cannot be used in an instance and global variable
	// declaration.
}
