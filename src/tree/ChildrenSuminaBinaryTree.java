package tree;

public class ChildrenSuminaBinaryTree {
    public static int isSumProperty(Node root) {
        // add your code here
        if(isSumPropertyHelper(root)){
            return 1;
        }
        return 0;
    }

    public static boolean isSumPropertyHelper(Node root){
        if(root!=null && root.left==null && root.right==null){
            return true;
        }
        return (root.data == ((root.left!=null ? root.left.data : 0) + (root.right!=null ? root.right.data : 0)))
                && (root.left == null || isSumPropertyHelper(root.left)) && (root.right == null || isSumPropertyHelper(root.right));
    }
}
