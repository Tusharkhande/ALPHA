import java.util.Scanner;

public class P6BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={2,4,6,7,8,10,14,16};
        System.out.println("Enter Key To Search: ");
        int key=sc.nextInt();
        
        int index=binarySearch(arr, key);
        if(index==-1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Key Found at Index: "+index);
        }
    
    }

    public static int binarySearch(int arr[],int key){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=(start+end)/2;

            if(arr[mid]==key){   //found
                return mid;
            }
            if(arr[mid]>key){    //left
                end=mid-1;
            }
            else{           //right
                start=mid+1;
            }
        }
        return -1;
    }
}
