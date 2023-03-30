import java.util.Scanner;
class MonthNumberException extends Exception{
    public MonthNumberException(){
        System.out.println("Invalid Month");
    }
}

public class P2throwthrows {
    
    static void monthNo(int m) throws MonthNumberException {
        if(m>12 || m<1)
            throw new MonthNumberException();
        
        System.err.println("Month no is" +m);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Month No");
        int m=sc.nextInt();
        try{
            monthNo(m);
        }catch(MonthNumberException me){
            System.out.println(me);
        }
        
    }
}
