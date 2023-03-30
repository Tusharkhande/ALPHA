import java.util.Scanner;

public class P11SumEvenOdd {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int evenSum=0;
        int oddSum=0;
        int choice;
        do{
            int no=sc.nextInt();

            if(no%2==0){
                evenSum+=no;
            }
            else{
                oddSum+=no;
            }

            System.out.println("Do you wanna continue?...Press 1 to continue or 0 to stop...");

            choice=sc.nextInt();

        }while(choice==1);

        System.out.println("Even sum is: "+evenSum);
        System.out.println("Odd Sum is: "+oddSum);
    }
}
