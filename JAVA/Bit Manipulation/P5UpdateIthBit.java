public class P5UpdateIthBit {
    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2,1 ));
    }

    public static int setIthBit(int n,int i){
        int bitMask=1<<i;
        return n | bitMask;
    }

    public static int clearIthBit(int n,int i){
        int bitMask=~(1<<i);
        return n & bitMask;
    }

    public static int updateIthBit(int n,int i,int newbit){
        // if(newbit==0){
        //     return clearIthBit(n, i);
        // }else{
        //     return setIthBit(n, i);
        // }

        //OR

        //clear ith bit first
        n=clearIthBit(n, i);
        int bitMask=newbit<<i;
        return n | bitMask;

    }
}
