public class P4Fact{

    public static void main(String[] args) {
        
        System.out.println(computeFactorial(5));

    }

    static int computeFactorial(int n){
        int result;
        if(n==0||n==1){
            return 1;
        }
        else{
            result=n*computeFactorial(n-1);
            return result;
        }
    }
}