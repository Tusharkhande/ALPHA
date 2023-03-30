import java.util.*;

public class P9BST2BalancedBST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
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

    public static Node createBST(ArrayList<Integer> arr, int si, int ei){
        if(si > ei){
            return null;
        }

        int mid = (si + ei)/2;
        Node root = new Node(arr.get(mid));
        root.left = createBST(arr, si, mid-1);
        root.right = createBST(arr, mid+1, ei);

        return root;
    }

    public static Node balanceBST(Node root){
        //inorder seq
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root,inorder);

        root = createBST(inorder, 0, inorder.size()-1);
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

    public static void main(String[] args) {


        Node root = new Node(8);
        root.left = new Node(6);
        root.right = new Node(10);
        root.left.left = new Node(5);
        root.right.right = new Node(11);
        root.left.left.left = new Node(3);
        root.right.right.right = new Node(12);

        
        
        preorder(root);
        System.out.println();

        root = balanceBST(root);

        preorder(root);
    }
}
