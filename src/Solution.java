import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    /**
     * Encodes the given list in a single string
     */
    public String encode(List<String> strs) {
        /**
         * Checking edge case
         */
        if (strs.size() == 0) {
            return Character.toString((char) 258);
        }
        String separator = Character.toString((char) 257);
        /**
         * For building our string
         */
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s);// Add current string to the builder
            sb.append(separator);// Add the separator
        }
        /**
         * Remove last character as it is a additional separator
         */
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    /**
     * Decodes the given string into a list of strings.
     * 
     * @param str
     * @return
     */
    public List<String> decode(String str) {
        if (str.equals(Character.toString((char) 258))) {
            return new ArrayList<>();
        }
        /**
         * We get the separator here
         */
        String separator = Character.toString((char) 257);
        /**
         * Create the decoded list of string. Apply splitting as long as the string is
         * not completely traversed through. Do splitting based on separator
         */
        return Arrays.asList(str.split(separator, -1));

    }

}
