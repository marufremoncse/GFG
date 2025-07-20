package tree;

public class DiameterofaBinaryTree {
    int diameter(Node root) {
        // Your code here
        int[] maxDiameter = new int[1];
        height(root, maxDiameter);

        return maxDiameter[0];
    }

    int height(Node root, int[] maxDiameter){
        if(root==null){
            return 0;
        }

        int leftHeight = height(root.left, maxDiameter);
        int rightHeight = height(root.right, maxDiameter);

        maxDiameter[0] = Math.max(maxDiameter[0], leftHeight + rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);
    }
}
