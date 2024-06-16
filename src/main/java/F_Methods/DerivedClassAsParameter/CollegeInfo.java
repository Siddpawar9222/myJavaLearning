package F_Methods.DerivedClassAsParameter;

public class CollegeInfo {
          College getInfo() {
        	  College college = new College();
        	  college.id=1021 ;
        	  college.clgName="Ferguson College";
        	  return college ;
          } //Assigning value in function
	public static void main(String[] args) {
		CollegeInfo ci = new CollegeInfo();
		ci.getInfo();
		College c = ci.getInfo();
		System.out.println(c.id + " "+ c.clgName);

	}

}
