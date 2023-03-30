public class P7MirrorBST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data= data;
        }
    }

    // public static Node insert(Node root, int val){
    //     if(root == null){
    //         root = new Node(val);
    //         return root;
    //     }

    //     if(root.data > val){
    //         root.left = insert(root.left, val);
    //     }else{
    //         root.right = insert(root.right, val);
    //     }

    //     return root;
    // }

    // public static void inorder(Node root){
    //     if(root == null){
    //         return;
    //     }

    //     inorder(root.left);
    //     System.out.print(root.data + " ");
    //     inorder(root.right);
        
    // }

    public static void preorder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static Node createMirror(Node root){
        if(root == null){
            return null;
        }

        Node leftMirror = createMirror(root.left);
        Node rightMirror = createMirror(root.right);

        root.left = rightMirror;
        root.right = leftMirror;

        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.left = new Node(11);

        preorder(root);
        System.out.println();

        root = createMirror(root);

        preorder(root);
    }
}
