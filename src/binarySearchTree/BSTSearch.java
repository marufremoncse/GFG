package binarySearchTree;

class Node {
    int data;
    Node left;
    Node right;
    Node(int d) {
        data = d;
        left = right = null;
    }
}

public class BSTSearch {
    boolean flag = false;
    // Function to search a node in BST.
    boolean search(Node root, int x) {
        // Your code here

        if(root.data == x){
            return true;
        }

        if(root.left!=null){
            flag = search(root.left, x);
        }

        if(root.right!=null){
            flag = search(root.right, x);
        }

        return flag;
    }
}
