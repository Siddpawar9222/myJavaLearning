package E_Strings.Program;

public class Combination {
    public static void main(String[] args) {
        String str = "abc";
        combinations(str, "");
    }

    public static void combinations(String str, String prefix) {
    	if(prefix !="") {
    		
    		System.out.println(prefix);
    	}

        for (int i = 0; i < str.length(); i++) {
        	
        	System.out.println(i+1);
        	System.out.println(i);
        	
            String remainder = str.substring(i + 1);
            combinations(remainder, prefix + str.charAt(i));
        
        }
    }
	
	
}



