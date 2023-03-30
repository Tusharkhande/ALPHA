import java.util.Scanner;

public class P5Calc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        int choice=sc.nextInt();
        int fact=1;
        switch(choice){
            case 1:
            System.out.println(a+b);
            break;
            case 2:
            System.out.println(a-b);
            break;
            case 3:
            System.out.println(a*b);
            break;
            case 4: 
            for(int i=1;i<=a;i++){
                fact=fact*i;
            }
            System.out.println(fact);
            break;
            default:
            System.out.println("Invalid");
            sc.close();
        }

    }
}
