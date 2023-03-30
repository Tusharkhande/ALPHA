public class P4PrintInRange {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root, int val){
        if(root==null){
            root = new Node(val);
            return root;
        }
        
        if(root.data > val){
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void printInRange(Node root, int k1, int k2){
        if(root == null){
            return;
        }

        if(root.data >= k1 && root.data <= k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        }

        else if(root.data > k1){
            printInRange(root.left, k1, k2);
        }
        else if(root.data <k2){
            printInRange(root.right, k1, k2);
        }
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void preorder(Node root ){
        if(root ==null){
            return;
        }

        System.out.println(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }


    public static void main(String[] args) {
        int values[] = {8,5,3,1,6,4,10,11,14};
        Node root = null;

        for(int i=0; i<values.length;i++){
            root = insert(root, values[i]);
        }

        preorder(root);
        inorder(root);
        System.out.println();

        printInRange(root, 5, 12);
    }
}
