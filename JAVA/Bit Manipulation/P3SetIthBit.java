public class P3SetIthBit {
    public static void main(String[] args) {
        System.out.println(setIthBit(9, 2));
    }

    public static int setIthBit(int n,int i){
        int bitMask=1<<i;
        
        return n | bitMask;
    }
}
