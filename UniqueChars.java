/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        // Replace the following statement with your code
        String ans = "";
        int n = s.length() - 1;

        for(int i = 0; i <= n; i++) {
            char current_char = s.charAt(i);
            if (current_char == ' ') 
                ans += current_char;
            if (ans.indexOf(current_char) == -1) 
                ans += current_char;
        }
        return ans;
    }
}