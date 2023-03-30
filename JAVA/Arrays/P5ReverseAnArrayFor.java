public class P5ReverseAnArrayFor {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }

    public static void reverse(int arr[]){
        int i=0,j;
        int l=arr.length-1;
        for(i=0;i<l;i++){
            for(j=l;j>i;j--){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        
    }
}

