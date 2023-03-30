public class P9PrimeInRange {
    public static boolean isPrime(int a){
        boolean isPrime=true;
        for(int i=2;i<a;i++){
            if(a%i==0){
                isPrime=false;

            }
        }
        return isPrime;
    }
    
    public static void primeInRange(int n){
        for(int i=2;i<n;i++){
            if(isPrime(i)){

                System.out.print(i+" ");
            }
        }
    }

    
    public static void main(String[] args) {
        System.out.print("Prime nos are: ");
       primeInRange(100);
    }
    
}
