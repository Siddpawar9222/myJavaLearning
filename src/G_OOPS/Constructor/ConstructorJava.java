package G_OOPS.Constructor;


public class ConstructorJava {
	public static void main(String[] args) {
		
//		->It is a special method in java which is used to initialize current class instance varaibles.
//
//		->Constructor name should be same as class name.
//
//		->Constructor will not have any return type (not even void)
//
//		Note: If we write return type for the constructor then it will become method.
//
//		Syntax:
//		-------
//
//		class Demo{
//			Demo(){
//		}
//		}
//		->when we will create object , we a re going to call constructor.
//		->So constructor will be initailized at the time of object creation.
//		->when you don't have any constructor java compilier will add the constructor.
//
//			Demo d = new Demo();
//		->At the time of object creation our class constructor will be executed.
//		Constructor is mandatory to create the object.
//
//		->object creation means calling the constructor.
//
//		->If we don't write the constructor the java compiler will add one default constructor to our class.
//
//		->we can check default constructor for the class using following command
//
//			javap classname
		
//		->if we write the constructor in the class then java compiler will not add any constructor.
//
//		->Constructor is initializing the instance variables with default values and objects 
//
//		In java constructor are divided into two types:
//
//		1)Parameterized constructor
//
//		2)Default constructor/Zero param constructor
//
//		Zero param constructor
//		=======================
//		->Consturctor without any parameters is called as zero param constructor.
//
//		class Employee{
//		Employee(){
//
//		}
//		}
//		Parameterized constructor
//		=========================
//		->The constructor which contains one or more parameters is called as parameterised constructor.
//
//		class Employee{
//		Employee(int id, String name){
//		}
//		}
//
//		This keyword
//		============
//		->It is a predefined keyword in java.
//
//		->It is used to represent current class object.
//
//		public class Students {
//			int id;
//			String name;
//			int age;
//			String gender;
//		public Students(int i, String name, int age, String gender) {
//				this.id = i;
//				this.name = name;
//				this.age = age;
//				this.gender = gender;
//				System.out.println(this.id +" "+this.name+" "+this.age+" "+this.gender);
//			}
//		public static void main(String[] args) {
//				Students Ram = new Students(101, "Ram", 23, "M");
//				Students Raj = new Students(102,"Raj", 24, "m");
//				
//			}
//		}
//		=========================================================================================
//		Constructor Overloading
//		========================
//		->writing more than one constructor with different parameters is called as constructor overloading
//
//		class Employee{
//
//		Employee(int id){
//		}
//		Employee(String s){
//
//		}
//		InputStreamReader isr = new InputStreamReader();
//		BufferedReader br = new BufferedReader(isr);
//		String s = new String("Hi");
//		StringBuffer sb = new StringBuffer(s);
//		==============================================================


	}
}