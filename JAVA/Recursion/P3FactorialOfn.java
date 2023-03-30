public class P3FactorialOfn {
    public static int factorialOfNo(int n){
        if(n==0){
            return 1;
        }
        
            return n*factorialOfNo(n-1);
            // int fnm1=factorialOfNo(n-1);
            // int fn=n*fnm1;
            // return fn;
        
    }

    public static void main(String[] args) {
        System.out.println(factorialOfNo(5));
    }
}
