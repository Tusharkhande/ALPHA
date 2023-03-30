public class P1BacktrackingArrays{
    public static void changeArr(int arr[],int i,int val){
        if(i==arr.length){
            printArr(arr);
            return;
        }
        //recursion
        arr[i]=val;
        changeArr(arr, i+1, val+1);
        arr[i]=arr[i]-2;    //backtracking step
    }

    public static void printArr(int arr[]){
        for(int x: arr){
            System.out.print(x+" ");
        }
    }

    public static void main(String args[]){
        int arr[]=new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}