import java.util.*;

public class P11MergeBST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void getInorder(Node root, ArrayList<Integer> arr){
        if(root == null){
            return;
        }

        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);

    }

    // public static Node mergeBSTs(Node root1, Node root2){
    //     ArrayList<Integer> arr1 = new ArrayList<>();
    //     getInorder(root1, arr1);

    //     ArrayList<Integer> arr2 = new ArrayList<>();
    //     getInorder(root2, arr2);

    //     ArrayList<Integer> finalArr = new ArrayList<>();
    //     int i=0,j=0;
    //     while(i<arr1.size() && j<arr2.size()){
    //         if(arr1.get(i) <= arr2.get(j)){
    //             finalArr.add(arr1.get(i));
    //             i++;
    //         }else{
    //             finalArr.add(arr2.get(j));
    //             j++;
    //         }
    //     }
    //     while(i<arr1.size()){
    //         finalArr.add(arr1.get(i));
    //         i++;
    //     }

    //     while(j<arr2.size()){
    //         finalArr.add(arr2.get(j));
    //         j++;
    //     }

    //     return createBST(finalArr, 0, finalArr.size()-1);
    // }

    public static Node mergeBSTs(Node root1, Node root2){
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1, arr1);

        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2, arr2);

        ArrayList<Integer> finalArr = new ArrayList<>();
        int i=0,j=0;
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i) < arr2.get(j)){
                finalArr.add(arr1.get(i));
                i++;
            }else{
                finalArr.add(arr2.get(j));
                j++;
            }
        }

        while(i<arr1.size()){
            finalArr.add(arr1.get(i));
            i++;
        }

        while(j<arr2.size()){
            finalArr.add(arr2.get(j));
            j++;
        }

        return createBST(finalArr, 0, finalArr.size()-1);
    }

    public static Node createBST(ArrayList<Integer> arr,int si,int ei){
        if(si>ei){
            return null;
        }

        int mid = (si + ei)/2;
        Node root = new Node(arr.get(mid));
        root.left = createBST(arr,si,mid-1);
        root.right = createBST(arr, mid+1, ei);
        return root;
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }


    public static void main(String args[]){
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);
        preorder(root1);
        System.out.println();

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);
        preorder(root2);
        System.out.println();

        Node root = mergeBSTs(root1, root2);

        preorder(root);
    }
}
