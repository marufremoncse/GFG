package binarySearchTree;

public class InsertaNodeinaBST {
    Node insert(Node root, int Key) {
        // your code here
        if (root == null) {
            return new Node(Key);
        }

        if (Key < root.data) {
            root.left = insert(root.left, Key);
        } else if(Key > root.data) {
            root.right = insert(root.right, Key);
        }

        return root;
    }
}
