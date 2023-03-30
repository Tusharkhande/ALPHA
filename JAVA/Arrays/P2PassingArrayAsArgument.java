public class P2PassingArrayAsArgument {
    public static void passarg(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]++;
        }
    }
    public static void main(String[] args) {
        int arr[]={99,98,97};

        passarg(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
