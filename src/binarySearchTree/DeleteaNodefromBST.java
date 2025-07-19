package binarySearchTree;

public class DeleteaNodefromBST {
    public static Node deleteNode(Node root, int X) {
        // code here.
        if(root==null){
            return null;
        }

        if(root.data>X){
            root.left = deleteNode(root.left, X);
        } else if(root.data<X){
            root.right = deleteNode(root.right, X);
        } else{
            if(root.left==null) return root.right;
            if(root.right==null) return root.left;

            Node minNode = findMin(root.right);
            root.data = minNode.data;
            root.right = deleteNode(root.right, minNode.data);
        }

        return root;
    }

    public static Node findMin(Node root) {
        while(root.left!=null){
            root = root.left;
        }
        return root;
    }
}
