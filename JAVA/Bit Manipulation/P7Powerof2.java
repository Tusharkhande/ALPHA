public class P7Powerof2 {
    public static void main(String[] args) {
        System.out.println(isPowerOf2(9));
    }

    public static boolean isPowerOf2(int n){
        return (n&(n-1))==0;
    }
}
