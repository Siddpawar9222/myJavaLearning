package F_Methods.DerivedClassAsParameter;

public class PersonM {
     String name ;
     int id ;
      void paraMethod(PersonM p1 , PersonM p2) {
    	  System.out.println(p1.name + " " + p1.id);
    	  System.out.println(p2.name + " " + p2.id);
      }
      
      PersonM setMethod() {
    	PersonM p1 = new PersonM(); 
    	 p1.id=454;
    	 p1.name="Rahul" ;
    	 return p1 ;
      }
     
     public static void main(String[] args) {
		PersonM p1 = new PersonM() ;
	    p1.id=101 ;
	    p1.name="Siddhesh" ;
		PersonM p2 = new PersonM() ;
	    p2.id=1001 ;
	    p2.name="pawar" ; 
	    
	    PersonM p = new PersonM();
	    p.paraMethod(p1, p2);
	    
	    PersonM p3 = p.setMethod();
	    System.out.println(p3.id + " " + p3.name);
	    
	}
}
