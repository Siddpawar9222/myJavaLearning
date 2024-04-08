package F_Methods.DerivedClassAsParameter;

public class PersonInfo {
	  String name ;
	  int id ;
      void getInfo(PersonInfo p1 , PersonInfo p2){
    	System.out.println(p1.name + " " + p1.id);     
    	System.out.println(p2.name + " " + p2.id);     
       }
      
       PersonInfo[]  m1() {
    	  PersonInfo p1 = new PersonInfo();
    	  p1.name="SiddheshWow";
    	  p1.id=452;
    	  
    	  PersonInfo p2 = new PersonInfo();
    	  p2.name="Siddheshwar";
    	  p2.id=455;
    	  
    	  PersonInfo p3 = new PersonInfo();
    	  p3.name="SiddheshShree";
    	  p3.id=454;
    	  
    	  PersonInfo[] arr = {p1 ,p2 , p3} ;
    	  return arr ;
       } 
      
	public static void main(String[] args) {
		PersonInfo pi = new PersonInfo();
		
		PersonInfo p1 = new PersonInfo();
		PersonInfo p2 = new PersonInfo();
		p1.name="Siddhesh";
		p1.id=404;
		
		p2.name="Rahul";
		p2.id=405;
		
//		pi.getInfo(p1, p2);
		pi.getInfo(pi, p2);
		 
		
		PersonInfo[] arr = pi.m1();
		for(int i=0 ;i< arr.length ; i++) {
			System.out.println(arr[i].id + " " +arr[i].name);
		}
     	
		
		
		
		

	

	}

}
