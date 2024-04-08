package B_Operators_Associtivity;

public class Strictfpkeyword{
    public static void main(String[] args) {
        double result = calculate();
        System.out.println("Result: " + result);
    }

    strictfp static double calculate() {
        return 1.0 / 3.0; // Perform a division using strictfp
    }
}

/*
In Java, the strictfp keyword is used as a modifier for classes, interfaces, and methods to ensure that floating-point calculations follow strict IEEE 754 standards for consistency across different platforms and implementations. When you declare a class, interface, or method as strictfp, all floating-point calculations within that scope will be performed with strict adherence to the IEEE 754 standard, regardless of the platform's underlying floating-point representation

The primary purpose of using the strictfp keyword is to avoid inconsistencies in floating-point calculations that can arise due to differences in how different processors or Java virtual machines (JVMs) handle floating-point operations

 */