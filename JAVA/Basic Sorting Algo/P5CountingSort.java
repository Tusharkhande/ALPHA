public class P5CountingSort {
    public static void main(String[] args) {
        int arr[]={1,4,3,1,2,6,2,6};
        System.out.print("Array before Sorting: ");
        print(arr);
        System.out.println();
        System.out.print("Array AfteSorting: ");
        countingSort(arr);
        print(arr);

    }

    public static void countingSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }

        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        //sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void print(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
