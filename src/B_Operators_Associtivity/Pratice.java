package B_Operators_Associtivity;



public class Pratice {

    public static void main(String[] args) {
        short a = 10;
       //a= a*10 ;     //error
        a = (short) (a * 10);  // Corrected line with parentheses
        System.out.println(a);
    }
}
