package G_OOPS.Polymorphism.DynamicMethodDispatch;

class MathUtils {
	public int add(int a, int b) {
		return a + b;
	}

	public double add(double a, double b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}
}

public class CTP {
	public static void main(String[] args) {
		MathUtils math = new MathUtils();
        
		int sum1 = math.add(2, 3);
		double sum2 = math.add(2.5, 3.7);
		int sum3 = math.add(2, 3, 4);

		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		
	}
}

/*
    Here at compile time(when we write the code) we come to know that particular method is going to call. This is known as Compile-time polymorphism 
    allows for code reuse and improves code readability by providing multiple versions of methods with the same name but different behaviors based on the argument types or count.
*/
