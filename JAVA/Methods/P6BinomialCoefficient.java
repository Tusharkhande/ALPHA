import java.util.Scanner;

public class P6BinomialCoefficient {
    public static int fact(int n){
        int fact=1;

        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }

    static int binoCoeff(int n,int r){
        int nf,rf,nrf;
        nf=fact(n);
        rf=fact(r);
        nrf=fact(n-r);
        
        int binoCoe=nf/(rf*nrf);
        return binoCoe;
        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n & r: ");
        int n=sc.nextInt();
        int r=sc.nextInt();
        binoCoeff(n,r);
        System.out.println("Binomial Coeficient is: "+binoCoeff(n,r));
        sc.close();
    }
}
 