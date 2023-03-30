import java.util.Scanner;

public class P9 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            String str=sc.nextLine();
            
            String s1=str.substring(0,1);
            String s2=str.substring(1);
            String res=s1.toUpperCase() + s2.toLowerCase();
            
            System.out.println(res);
        }
}
