public class P2Swap {

    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("Formal: "+a + b);

    }

    public static void main(String[] args) {
        int a=10;
        int b=20;
        swap(a,b);
        System.out.println("Actual: "+a + b);
    }

}
