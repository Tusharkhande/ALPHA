public class P9MaxSubSumPrefix {
    public static void main(String[] args) {
        int arr[]={1,-1,6,-1,3};
        prefixSum(arr);
    }

    public static void prefixSum(int arr[]){
        int currsum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];

        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){

                currsum=(i==0)?prefix[j]:prefix[j]-prefix[i-1];

                if(maxSum<currsum){
                    maxSum=currsum;
                }
            }
        }
        System.out.println("Max Sum: "+maxSum);
    }
}
