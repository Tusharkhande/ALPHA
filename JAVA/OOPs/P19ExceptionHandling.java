import java.util.Scanner;

public class P19ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        int a,b,res;
        int c[]={1,2,3};
        try{
            for(int i=0;i<3;i++){
                System.out.println(c[i]);
            }
            str=sc.nextLine();
            a=Integer.parseInt(str);
            str=sc.nextLine();
            b=Integer.parseInt(str);
            res=a/b;
            System.out.println("Res is: "+res);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception"+e);
        }catch(NumberFormatException nfe){
            System.out.println("NumberFormatException");
        }catch(ArrayIndexOutOfBoundsException aiob){
            System.out.println("ArraiIndexOutOfBoundsException");
        }
    }
}
