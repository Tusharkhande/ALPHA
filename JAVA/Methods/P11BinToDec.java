import java.util.Scanner;

public class P11BinToDec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Binary No: ");

        int n=sc.nextInt();

        dec(n);

    }

    public static void dec(int n){
        int dec=0;
        int pow=0;
        int ld;
        int m=n;
        while(n>0){
            ld=n%10;
            dec=dec+(ld*(int)Math.pow(2,pow));
            pow++;
            n=n/10;
        }
        System.out.println("Decimal of Binary No "+m+" is: "+ dec);
    }
}
