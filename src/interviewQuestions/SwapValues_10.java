package interviewQuestions;

public class SwapValues_10 {
    public static void main(String[] args) {

        int a= 1;
        int b= 9;
        a= a+b;
        b= a-b;
        a = a-b;

        System.out.println(a);
        System.out.println(b);
    }
}
