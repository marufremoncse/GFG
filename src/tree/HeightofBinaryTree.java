package tree;

public class HeightofBinaryTree {
    int height(Node node) {
        // code here
        if(node == null){
            return 0;
        }
        return Math.max((node.left!=null ? 1 + height(node.left) : 0),(node.right!=null ? 1 + height(node.right) : 0));
    }
}
