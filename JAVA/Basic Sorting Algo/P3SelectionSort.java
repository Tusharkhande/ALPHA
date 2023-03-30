public class P3SelectionSort {
    public static void main(String[] args) {
        int arr[]={5,9,7,3,1,2};
        
        SelectionSort ss=new SelectionSort();
        System.out.print("Array Before Sorting is: ");
        ss.print(arr);

        System.out.println();

        ss.seletionSort(arr);
        System.out.print("Array after Sorting is:");
        ss.print(arr);

    }
}

class SelectionSort{
    void seletionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int minEle=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minEle]>arr[j]){
                    minEle=j;
                }
            }
            int temp=arr[minEle];
            arr[minEle]=arr[i];
            arr[i]=temp;
        }
    }

    void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
