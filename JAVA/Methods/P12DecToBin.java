import java.util.Scanner;

public class P12DecToBin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Decimal No: ");
        int n=sc.nextInt();
        binno(n);
    }

    public static void binno(int decNo){
        int bin=0;
        int pow=0;
        int m=decNo;
        while(decNo>0){
            int rem=decNo%2;
            bin=bin+(rem*(int)Math.pow(10,pow));
            pow++;
            decNo=decNo/2;
        }
        System.out.println("Binary of Decimal No "+m+" is: "+bin);
        
    }
}
