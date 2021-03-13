package interviewQuestions;

public class ReverseWords_3 {
    
    public String reverseWords(String str ){
        StringBuilder reversedWords = new StringBuilder();
        
        String[] strArr = str.split(" ");

        for (int i = strArr.length-1; i >=0  ; i--) {

            reversedWords.append(strArr[i]+" ");
        }
        
        
        
        
        
        return reversedWords.toString();
        
    }
}
