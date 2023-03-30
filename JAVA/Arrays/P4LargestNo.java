import java.util.Scanner;

public class P4LargestNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter no at index "+i);
            arr[i]=sc.nextInt();
        }
        System.out.println("Largest No is: "+compare(arr));
    }

    public static int compare(int arr[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
            if(smallest>arr[i]){
                smallest=arr[i];
            }
        }
        System.out.println("Smallest No is: "+smallest);
        return largest;
    }
}
