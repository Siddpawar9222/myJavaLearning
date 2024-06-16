package E_Strings.Program;


import java.util.Arrays;
public class TestQ4 {
    public static String sort(String s) {
      // Method to arrange the letter in alphabetical order of string
        char temp;
        char[] arr = s.toCharArray();
        for (int i = 0; i < (arr.length - 1); i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        return Arrays.toString(arr);

    }

    public static void main(String[] args) {
        // anagram string
        String a = args[0];
        String b = args[1];
    
        if (a.length() == b.length()) {
            if (sort(a).equalsIgnoreCase(sort(b))) {
                System.out.println("It is anagram strings");
            } else {
                System.out.println("It is not anagram strings");
            }
        }

        else{
            System.out.println("It is not anagram strings");
        }
  
        
    }

}
