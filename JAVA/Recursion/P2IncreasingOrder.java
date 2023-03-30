

public class P2IncreasingOrder {
    public static void printi(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        printi(n-1);
        System.out.print(n);
    }

    public static void main(String[] args) {
        printi(5);
    }
}
