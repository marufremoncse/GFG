package tree;

import java.util.ArrayList;
class Node {
    int data;
    Node left, right;
    Node(int item)    {
        data = item;
        left = right = null;
    }
}
public class InorderTraversal {
    ArrayList<Integer> ls = new ArrayList<>();
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        if(root==null){
            return ls;
        }

        if(root.left!=null){
            inOrder(root.left);
        }
        ls.add(root.data);
        if(root.right!=null){
            inOrder(root.right);
        }

        return ls;
    }
}
