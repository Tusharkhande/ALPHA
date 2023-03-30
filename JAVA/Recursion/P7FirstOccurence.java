public class P7FirstOccurence {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,4,8,8,5,6};    
        System.out.println(FO(arr, 0, 9));
    }

    public static int FO(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        
        return FO(arr, i+1, key);
    }

}
