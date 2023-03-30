import java.util.Scanner;

public class P18Exception {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int c=a/b;
        // System.out.println(c);

        String str;
        str=sc.nextLine();
        int a=Integer.parseInt(str);
        str=sc.nextLine();
        int b=Integer.parseInt(str);
         int res= a/b;

         System.out.println(res);
    }
}
