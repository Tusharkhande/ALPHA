import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class P1Matrix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int r=sc.nextInt();
        System.out.print("Enter Columns: ");
        int c=sc.nextInt();

        int matrix[][]=new int[r][c];

        System.out.println("Enter elements of Matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.print("Enter Key to Search: ");
        int key=sc.nextInt();
        search(matrix, key,r,c);

        compare(matrix, r, c);
    }

    public static boolean search(int matrix[][],int key,int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==key){
                    System.out.println("Found at cell ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Not found");
        return false;
    }

    public static void compare(int matrix[][],int r,int c){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                largest=Math.max(largest,matrix[i][j]);
                smallest=Math.min(smallest,matrix[i][j]);
            }
        }
        System.out.println("Largest Element is: "+largest);
        System.out.println("Smallest Element is: "+smallest);

    }
}