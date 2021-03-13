package interviewQuestions;

public class StringReverse_1 {
    // reverseStr("apple")  -> elppa
    // reverseStr("John")   -> nhoJ
    // reverseStr("phone")  -> enohp
    // reverseStr("123456") -> "654321"

    public String reverseStr(String str) {
        // create variable to store reversed version of str
        StringBuilder reverse = new StringBuilder();

        // iterate over input string from the back with charAt
        for(int i = str.length() - 1; i >= 0; i--) {
            // add chars to reversed variable
            reverse.append(String.valueOf(str.charAt(i)));
        }

        // convert to string and return reversed version
        return reverse.toString();
    }

    // Time Complexity: O(n)
    // Using StringBuilder will be more efficient than String
    // String is immutable and concatenation in the loop will create many String objects




    public String reverseString(String str ){
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= str.length(); i++) {
            result.append(str.charAt(str.length()-i));
        }
        return result.toString();
    }
}
