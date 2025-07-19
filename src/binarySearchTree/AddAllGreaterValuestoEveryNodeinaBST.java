package binarySearchTree;

public class AddAllGreaterValuestoEveryNodeinaBST {
    public Node modify(Node root) {
        // Write your code here
        int[] sum = new int[1];
        reverseInOrder(root, sum);
        return root;
    }

    public void reverseInOrder(Node root, int[] sum){
        if(root.right!=null){
            reverseInOrder(root.right, sum);
        }

        sum[0]+=root.data;
        root.data = sum[0];

        if(root.left!=null){
            reverseInOrder(root.left, sum);
        }
    }
}
