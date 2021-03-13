package interviewQuestions;

public class fibonacchi {
    public int getfibonacchiNumber(int step) {
        int a = 0;
        int b = 1;
        int c = 0;
        while (step > 1) {
            c = a + b;
            a = b;
            b = c;
            step--;
        }
        return c;
    }

    public int recursiveFib(int n){
        if (n <= 1){
            return n;
        }
        return recursiveFib(n-1) + recursiveFib(n-2);
    }

    public static void main(String[] args) {
        fibonacchi f = new fibonacchi();
        System.out.println(f.getfibonacchiNumber(5));
    }
}
