public class P8CountSetBits {
    public static void main(String[] args) {
        System.out.println(countSetBits(2));
    }

    public static int countSetBits(int n){
        int count=0;
        while(n>0){
            if((n & 1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
}
