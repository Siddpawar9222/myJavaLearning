package E_Strings.Program;
public class TestQ7 {
    public static void main(String[] args) {

        String s = "hello my friend";
        String[] words = s.split(" ");
        String newString = "";
        for (int i = 0; i < words.length; i++) {
            String name = words[i];
            String rev = "";
            for (int j = name.length() - 1; j >= 0; j--) {
                rev += name.charAt(j);
            }
            newString += rev + " ";

        }
        System.out.println(newString);
         
        
    }

}
