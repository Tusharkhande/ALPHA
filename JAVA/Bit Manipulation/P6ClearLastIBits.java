public class P6ClearLastIBits {
    public static void main(String[] args) {
        System.out.println(clearlastIbits(15, 2));
    }

    public static int clearlastIbits(int n,int i){
        int bitMask=-1<<i;                             
        //OR  int bitMask=(~0)<<i;
        return n & bitMask;
        
    }
}
