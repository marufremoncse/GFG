package binarySearchTree;

public class CheckforBST {
    boolean isBST(Node root) {
        // code here.
        long min = Long.MIN_VALUE;
        long max = Long.MAX_VALUE;
        return isBSTHelper(root, min, max);
    }

    boolean isBSTHelper(Node root, long min, long max){
        if(root==null){
            return true;
        }
        if(min>=root.data || root.data>=max){
            return false;
        }

        return isBSTHelper(root.left, min, root.data) && isBSTHelper(root.right, root.data, max);
    }
}
