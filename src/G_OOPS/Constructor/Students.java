package G_OOPS.Constructor;

public class Students {
     int id ;
     String name;
     int age ;
     String gender ;
     public Students(int id , String name , int age ,String gender) {
		this.id =id;
		this.name =name;
		this.age =age;
		this.gender=gender ;
		System.out.println(this.id +" " + this.name + " " +this.age +" " + this.gender);
	}
	public static void main(String[] args) {
	 
		Students s = new Students(1, "Siddhesh", 22, "Male");
		Students s1 = new Students(2, "Rahul", 20, "Male");

	}

}
