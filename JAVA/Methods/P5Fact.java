import java.util.Scanner;

public class P5Fact {
    static int factorial=1;
    static int fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        else{
        for(int i=1;i<=n;i++){
        factorial=factorial*i;}
        return factorial;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n=sc.nextInt();
        int facto=fact(n);
        System.out.println("Factorial is : "+facto);
    }
}
