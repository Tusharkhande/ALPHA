public class P4InsertionSort {
    public static void main(String[] args) {
        int arr[]={5,7,9,8,3,1};
        System.out.print("Array Before Sorting:");
        print(arr);
        System.out.println();

        insertionSort(arr);
        System.out.print("Array after insertion: ");
        print(arr);
    }

    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;  
            //finding the correct position to insert
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }

    public static void print(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
