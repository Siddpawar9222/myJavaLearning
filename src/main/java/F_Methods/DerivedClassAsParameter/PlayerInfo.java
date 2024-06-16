package F_Methods.DerivedClassAsParameter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Object as return type

public class PlayerInfo {
	Player get(int id) {
		Player p = new Player() ;
		if(id==18) {
			p.id = 18 ;
			p.name = "Virat Kohli";
			p.age = 34 ;	
		}
		else if(id==45) {
			p.id = 45 ;
			p.name = "Rohit Sharma";
			p.age = 35 ;	
		}
         
		else if(id==7) {
			p.id = 7 ;
			p.name = "MSD";
			p.age = 41 ;	
		}
		else if(id==10) {
			p.id = 10 ;
			p.name = "Sachin Tendulakar";
			p.age = 49 ;	
		}
		
		return p ;
		
	}

	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter Your Id");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str = br.readLine();
        int id = Integer.parseInt(str);
         
         
         PlayerInfo pi = new PlayerInfo();
         Player p=  pi.get(id);
         
         System.out.println("Id: " + p.id + " " +"Name: " + p.name + " " +"Age: " +p.age);
	}

}
