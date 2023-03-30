import java.util.Scanner;

public class P3IncomeTax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int income=sc.nextInt();
        if(income<500000){
            System.out.println("0% tax");
        }
        else if(income>500000 && income<1000000){
            System.out.println("20% tax");
        }
        else{
            System.out.println("30% tax");
        }
        sc.close();
    }
}
