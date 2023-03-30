import java.util.Scanner;

public class P6Leap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        boolean leap=false;

        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                leap=true;    
                }
                else leap=false;
            }
            else leap=true;
        }
        else{
            leap=false;
        }

        if(leap){
            System.out.println("leap");
        }
        else System.out.println("not leap");
    }
             
}
