

public class BST {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
        }
    }
    
    static Node insert(Node root, int val){
        if(root == null){
            return new Node(val);
        }

        if(val<root.data){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }

        return root;
    }

    // static void preOrder(Node root){
    //     if (root == null){
    //         return;
    //     }
    //     System.out.println(root.data + " ");
    //     preOrder(root.left);
    //     preOrder(root.right);
    // }

    
    // static void inOrder(Node root){
    //     if (root == null){
    //         return;
    //     }
      
    //     inOrder(root.left);
    //     System.out.println(root.data + " ");
    //     inOrder(root.right);
    // }


    static void postOrder(Node root){
        if (root == null){
            return;
        }
      
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data + " ");
    }

      
    public static void main(String[] args) {
        int[] nodes = {50, 30, 70, 20, 40, 60, 80};
        Node root = null;

        for (int val : nodes){
            root = insert(root, val);
        }
        
        // System.out.println(root.data);
        // preOrder(root);
        // inOrder(root);
        postOrder(root);
    }
}
