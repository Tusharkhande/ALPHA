import java.util.Scanner;

public class P13MultTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no: ");
        int number=sc.nextInt();
        table(number);
        sc.close();
    }

    public static void table(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
}
