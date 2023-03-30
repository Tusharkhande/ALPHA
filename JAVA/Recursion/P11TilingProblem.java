public class P11TilingProblem {
    public static void main(String[] args) {
    System.out.println(tilingProblem(4));        
    }

    public static int tilingProblem(int n){
        if(n==0 || n==1){
            return 1;
        }

        //vertical choice
        int fn_1=tilingProblem(n-1);

        //horizontal choice
        int fn_2=tilingProblem(n-2);

        int totWays=fn_1+fn_2;
        return totWays;
    }
}
