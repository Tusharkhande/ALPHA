public class P8GridWays {

    public static int factorial(int x){
        if(x==0 || x==1){
            return 1;
        }
        return x*factorial(x-1);
    }

    public static int gridWays(int n,int m){
        int f1=factorial(n-1);
        int f2=factorial(m-1);
        int f3=factorial(n-1+m-1);
        return f3/(f1*f2);

    }
    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(gridWays(n, m));
    }
}
