package interviewQuestions;

public class NumberPalindrome_5 {
    public  boolean isPalindrome(int num){
         int copy= num;
         int reserved = 0;
         int remainder;

         while(num>0){

             remainder = num %10;
             reserved = (reserved*10) + remainder;
             num= num /10;
         }


        return reserved == copy;
    }
}
