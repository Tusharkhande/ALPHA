public class P5PrintNthFibonacciNo {
    public static int Fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        
        int fibn_1=Fibonacci(n-1);
        int fibn_2=Fibonacci(n-2);
        int fibn=fibn_1+fibn_2;
        return fibn;
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(30));
    }
}
