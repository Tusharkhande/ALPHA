public class P4SumOfNNaturalNos {
    public static int calcSum(int n){
        
        if(n==1){
            return 1;
        }
        int s=calcSum(n-1);
        int sum=n+s; 
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
