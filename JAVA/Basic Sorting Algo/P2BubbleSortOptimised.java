public class P2BubbleSortOptimised {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        bubbleSort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        } 
    }

    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int swap=0;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    swap++;
                }
            }
            if(swap==0){
                break;
            }
        }
        
    }
}
