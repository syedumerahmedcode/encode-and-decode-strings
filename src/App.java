import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        /**
         * Design an algorithm to encode a list of strings to a single string and decode
         * a single string back to the original list of strings.
         * 
         * Encoding Scheme
         * 
         * To encode a list of strings, you can use the following scheme:
         * 
         * The encoded string should contain the length of each string followed by a
         * delimiter (for example, a #) and then the actual string itself.
         * For example, if you have the strings ["hello", "world"], the encoded string
         * would be "5#hello5#world".
         * 
         * Decoding Scheme
         * 
         * To decode the encoded string back into the original list of strings:
         * 
         * Split the encoded string using the delimiter to retrieve each string along
         * with its length.
         * Use the length information to extract the actual strings.
         * 
         * Example
         * 
         * Input: ["hello", "world"]
         * Encode: "5#hello5#world"
         * Decode: ["hello", "world"]
         * 
         * Input: ["leet", "code", "", "hi"]
         * Encode: "4#leet4#code0##2#hi"
         * Decode: ["leet", "code", "", "hi"]
         * 
         * 
         */
        System.out.println("Hello, World!");
        List<String> strs = new ArrayList<>();
        strs.add("hello");
        strs.add("world");
        Solution solution = new Solution();
        String encoded = solution.encode(strs);
        List<String> decoded = solution.decode(encoded);
        System.out.println("The encoded string is: " + encoded);
        System.out.println("The decoded list of string is:");
        decoded.stream().forEach(System.out::println);
    }
}
