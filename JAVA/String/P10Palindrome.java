import java.util.Scanner;

public class P10Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter String: ");
        String str=sc.next();
        
        for(int i=0;i<str.length();i++){
            for(int j=str.length()-1;j>=i;j--){
                if(str.charAt(i)==str.charAt(j)){
                    System.out.println("P");
                    return;
                }
                else{
                    System.out.println("NP");
                    return;
                }
            }
        }
    }
}
