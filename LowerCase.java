/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        // Replace the following statement with your code
        String ans = " ";
        int n = s.length() - 1;
        char current_char;

        for (int i = 0; i <= n; i++) {
            current_char = s.charAt(i);
            if (current_char >= 'A' && current_char <= 'Z') {
                ans += (char) (current_char + 32);
            } else { 
                ans += current_char;
            }
            
        }
        return ans;
    }
}
