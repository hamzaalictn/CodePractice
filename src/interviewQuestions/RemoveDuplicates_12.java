package interviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates_12 {

    public String removeDuplicate(String str) {

        String result = "";
        for (char c : str.toCharArray() ){
            if(!result.contains(c+"")){
                result+=c;
            }
        }


        return result;
    }


    public String removeDuplicatesWithSet(String str) {
        Set<Character> set = new HashSet<Character>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

        String result = "";

        for (Character ch : set) {
            result = result + ch;
        }


        return result;

    }
}
