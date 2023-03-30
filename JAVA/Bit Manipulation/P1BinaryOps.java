public class P1BinaryOps {
    public static void main(String[] args) {
        evenOdd(3);
        evenOdd(56);
        evenOdd(9);
    }

    public static void evenOdd(int n){
        int bitMask=1;
        if((n & bitMask)==0){
            System.out.println("Even no");
        }
        else{
            System.out.println("odd no");
        }
    }
}
