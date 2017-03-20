/**
 * Created by Alex on 20-Mar-17.
 */
public class StringService {
    public boolean isPalindrome(String input) {
        StringBuilder sb = new StringBuilder(input);

        String reversedInput = sb.reverse().toString();

        return reversedInput.equals(input);
    }
}