package binarySearchTree;

public class MinimumElementinBST {
    int minValue(Node root) {
        // code here
        while(root!=null && root.left!=null){
            root = root.left;
        }

        return root.data;
    }
}
