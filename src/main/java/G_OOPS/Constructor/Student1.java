package G_OOPS.Constructor;
//constructor overlodding

class Student2{
	int id , passoutYear ;
	String name , contactNo , collegeName ;
	
	public Student2(String contactNo , String collegeName , int passoutYear) {
		this.contactNo = contactNo;  
		this.collegeName = collegeName;  
		this.passoutYear = passoutYear; 
	}
	public Student2(int id, String name){ 
		//However, we can use this keyword inside the constructor, which can be used to invoke the other constructor of the same class.
		this("9899234455", "IIT Kanpur", 2018);  
		this.id = id;  
		this.name = name;  
		} 
}
public class Student1 {
     String name ;
     int id ;
     
     public Student1() {
    	 System.out.println("This is default(without Parameters) constructor");
     }
     
	 public Student1(String name , int id) {
		 this.name =name ;
		 this.id=id ;
		 System.out.println("Name: "+this.name +" "+"Id: "+id);
	 }
	public static void main(String[] args) {
		Student1 s1 =new Student1("Siddhesh", 22);
		System.out.println(s1.name +" "+s1.id);
		
		
		Student1 s2 =new Student1();
		System.out.println(s2.name + " " +s2.id);
		
		System.out.println();
//------------------------------------------------------
		
		Student2 st2 = new Student2(101 ,"John");
		System.out.println("Name: "+st2.name+"\nId: "+st2.id+"\nContact No.: "+st2.contactNo+"\nCollege Name: "+st2.contactNo+"\nPassing Year: "+st2.passoutYear); 
		
	}

}
