package tree;

import java.util.ArrayList;

public class PostorderTraversal {
    ArrayList<Integer> ls = new ArrayList<>();
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root) {
        // Code
        if(root==null){
            return ls;
        }

        if(root.left!=null){
            postOrder(root.left);
        }

        if(root.right!=null){
            postOrder(root.right);
        }

        ls.add(root.data);

        return ls;
    }
}
