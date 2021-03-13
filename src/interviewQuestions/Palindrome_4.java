package interviewQuestions;

public class Palindrome_4 {

    public boolean isPalindrome(String str) {
        int lastIndex = str.length() - 1;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(lastIndex - i)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPal(String str) {
        // we will use two 'pointers'. One pointer will start looking from beginning
        // another from the back. If values of pointers are not equal, we can return false

        int j = str.length() - 1; // pointer for the back

        // loop will go till half because we have two pointers
        for (int i = 0; i < str.length() / 2; i++) {
            // if pointers values are not equal return false
            if (str.charAt(i) != str.charAt(j - i)) {
                return false;
            }
        }

        // if program reach here, it means all values were equal so it's palindrome
        return true;
    }

    // Time Complexity: O(n/2) but we can say just O(n)

}
