public class P8LastOccurence {
    public static void main(String[] args) {
        int arr[]={1,2,6,5,4,6,5,6,9};
        // System.out.println(lastOccurence(arr, arr.length-1, 6));
        System.out.println(lastOccurence(arr, 0, 6));
    }

    public static int lastOccurence(int arr[],int i,int key){
        // if(i==0){
        //     return -1;
        // }
        // if(arr[i]==key){
        //     return i;
        // }
        // return lastOccurence(arr, i-1, key);
        
        if(i==arr.length){
            return -1;
        }
        int isFound=lastOccurence(arr, i+1, key);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
}
