public class P16QuickSort {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void quickSort(int arr[], int si,int ei){
        if(si>=ei){
            return;
        }

        int pidx=partition(arr,si,ei);
        quickSort(arr, 0, pidx-1);  //left
        quickSort(arr, pidx+1, ei); //right
    }

    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1; //to make place for els smaller than pivot

        for(int j=si;j<arr.length;j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[]={6,3,9,8,2,5,-3};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
