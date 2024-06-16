package F_Methods.DerivedClassAsParameter;

public class UniversityInfo {
	  public void printDetailsUniversity(University u){
		 System.out.println("The id of University is "+ u.id); 
		 System.out.println("The name of University is "+ u.name); 
	  }
	

	public static void main(String[] args) {
		UniversityInfo ui = new UniversityInfo();
		University u = new University() ;
		u.id=10 ;
		u.name="Oxford" ;
		ui.printDetailsUniversity(u);
		
		
	} 

}
