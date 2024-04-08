package F_Methods.DerivedClassAsParameter;

public class StudentInfo {
	void printStudent(Student s1) {
		System.out.println("The Student id is " + s1.id);
		System.out.println("The Student name is " + s1.name);
	}

	public static void main(String[] args) {

		StudentInfo m= new StudentInfo();
		Student s = new Student();
		s.id = 1010;
		s.name = "Siddhesh";
		m.printStudent(s);
	}

}
