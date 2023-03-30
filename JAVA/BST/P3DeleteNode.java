public class P3DeleteNode {
    static class Node{
        int data; 
        Node left;
        Node right;

        Node (int data){
            this.data=data;
        }
    }

    public static Node insert(Node root, int val){
        if(root == null){
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

    public static Node delete(Node root, int val){
        if(root.data > val){
            root.left = delete(root.left, val);
        }
        else if(root.data < val){
            root.right = delete(root.right, val);
        }
        else{
            //case 1 - leaf Node
            if(root.left == null && root.right == null){
                return null;
            }
            // case 2 - one child
            if(root.left == null){
                return root.right;
            }
            else if (root.right == null){
                return root.left;
            }

            //case 3 - two children

            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }

        return root;
    }

    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int values[]= {8,5,3,1,6,4,10,11,14};

        Node root= null;

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();

        delete(root, 10);
        System.out.println();

        inorder(root);
    }
}
