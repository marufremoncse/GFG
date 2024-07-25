package tree;

import java.util.ArrayList;

public class PreorderTraversal {
    static ArrayList<Integer> preorder(Node root, ArrayList<Integer> ls){
        if(root==null){
            return ls;
        }

        ls.add(root.data);

        if(root.left!=null){
            preorder(root.left, ls);
        }

        if(root.right!=null){
            preorder(root.right, ls);
        }
        return ls;
    }
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        ArrayList<Integer> ls = new ArrayList<>();

        ls = preorder(root, ls);

        return ls;
    }
}
