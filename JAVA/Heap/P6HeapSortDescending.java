public class P6HeapSortDescending {

    public static void heapify(int arr[], int i, int size){
        int left = 2*i+1;
        int right = 2*i+2;
        int minIdx = i;

        if(left < size && arr[left] < arr[minIdx]){
            minIdx = left;
        }

        if(right < size && arr[right] < arr[minIdx]){
            minIdx = right;
        }

        if(minIdx != i){
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;

            heapify(arr, minIdx, size);
        }
    }

    public static void heapSort(int arr[]){
        int n = arr.length;
        for(int i=n/2; i>=0; i--){
            heapify(arr,i,n);
        }

        for(int i=n-1; i>0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,5,6,4,3,9};

        heapSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
