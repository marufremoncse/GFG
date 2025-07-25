package binarySearchTree;

public class LowestCommonAncestorinaBST {
    Node LCA(Node root, Node n1, Node n2) {
        // your code here.
        if(root==null){
            return null;
        }
        if(n1.data<root.data && n2.data<root.data){
            return LCA(root.left, n1, n2);
        } else if(n1.data>root.data && n2.data>root.data){
            return LCA(root.right, n1, n2);
        }

        return root;
    }
}
