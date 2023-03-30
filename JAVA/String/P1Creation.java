import java.util.Scanner;

public class P1Creation{
    public static void main(String[] args) {
        // String s1="Tushar";
        // String s2=new String("Khande");
        
        // Scanner sc=new Scanner(System.in);

        // String s3=sc.nextLine();

        // System.out.println(s1+"\n"+s2+"\n"+s3);

        //concatenation
        String fname="Tushar";
        String lname="Khande";
        String fullname=fname+" "+lname;

        printString(fullname);
    }

    public static void printString(String fullname){
        for(int i=0;i<fullname.length();i++){
            System.out.print(fullname.charAt(i));
        }
    }
}