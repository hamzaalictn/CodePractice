package interviewQuestions;

import java.util.Arrays;

public class StringAnagram_11 {
    public boolean isAnagram(String str , String str1) {
        if (str1.length() != str.length()){
            return false;
        }
        char [] arr = str.toCharArray();
        char [] arr1 = str1.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr1);



        return Arrays.equals(arr1,arr);
    }
}
