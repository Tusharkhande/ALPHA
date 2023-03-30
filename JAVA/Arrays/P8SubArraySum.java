public class P8SubArraySum {
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        subSum(arr);
    }

    public static void subSum(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        int minSum=Integer.MAX_VALUE;
        int currsum=0;

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currsum=0;
                for(int k=i;k<=j;k++){
                    //System.out.print(arr[k]+" ");
                    currsum+=arr[k];

                }
                System.out.println(currsum);
                if(maxSum<currsum){
                    maxSum=currsum;
                }
                if(minSum>currsum){
                    minSum=currsum;
                }
                //System.out.println();
            }
            //System.out.println();
        }
        System.out.println("Max Sum is: "+maxSum);
        System.out.println("Min Sum is: "+minSum);
    }
}


//Time complexity=====O(n^3)