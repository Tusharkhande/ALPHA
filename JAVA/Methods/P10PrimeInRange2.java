import java.util.Scanner;

public class P10PrimeInRange2 {
    
    static int prime(int n){
        for(int i=2;i<=n;i++){
            int count=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==0)
                System.out.print(i+" ");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N: ");
        int n=sc.nextInt();
        prime(n);
    }
}
