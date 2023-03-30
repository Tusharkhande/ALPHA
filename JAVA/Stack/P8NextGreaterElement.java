import java.util.*;

public class P8NextGreaterElement {
    // public static void main(String args[]){
    //     int arr[]={6,8,0,1,3};
    //     int nextGreater[]=new int[arr.length];

    //     for(int i=0;i<arr.length;i++){
    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[i]<arr[j]){
    //                 nextGreater[i]=arr[j];
    //                 break;
    //             }
    //             else{
    //                 nextGreater[i]=-1;
    //             }
    //         }
    //         // nextGreater[i]=-1;
    //     }

    //     for(int i=0;i<nextGreater.length;i++){
    //         System.out.println(nextGreater[i]);
    //     }
    // }

    public static void nextGreaterEl(Stack<Integer> s,int arr[],int nextGreater[]){

        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextGreater[i]=-1;
            }
            else{
                nextGreater[i]=arr[s.peek()];
            }
            s.push(i);
        }
    }

    public static void printArray(int nextGreater[]){
        for(int i=0;i<nextGreater.length;i++){
            System.out.println(nextGreater[i]);
        }
    }

    public static void main(String args[]){
        int arr[]={2,1,5,6,2,3};;
        int nextGreater[]=new int[arr.length];
        Stack<Integer> s=new Stack<>();
        nextGreaterEl(s, arr, nextGreater);
        printArray(nextGreater);
    }
}
