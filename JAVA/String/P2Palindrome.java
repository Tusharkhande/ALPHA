import java.util.Scanner;

public class P2Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter String: ");
        String s1=sc.next();
        isPalindrome(s1);
    }

    public static boolean isPalindrome(String s1){
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==s1.charAt(s1.length()-1-i)){
                System.out.println("Palindrome");
                return true;
            }
        }
        System.out.println("Not a Palindrome");
        return false;
    }
}
