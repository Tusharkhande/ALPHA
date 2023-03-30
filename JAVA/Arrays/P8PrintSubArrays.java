public class P8PrintSubArrays {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        printSub(arr);
    }

    public static void printSub(int arr[]){
        int ts=0;
        for(int i=0;i<arr.length;i++){          //start
            for(int j=i;j<arr.length;j++){      //end
                for(int k=i;k<=j;k++){         //from start(i) to end j
                    System.out.print(arr[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays are: "+ts);
    }
}
