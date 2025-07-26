package binarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class NormalBSTtoBalancedBST {
    List<Integer> ls;
    Node balanceBST(Node root) {
        ls = new ArrayList<>();
        inOrder(root);

        return buildBST(0, ls.size()-1);
    }

    Node buildBST(int left, int right){
        if(left>right){
            return null;
        }

        int mid = left + (right - left) / 2;
        Node node = new Node(ls.get(mid));
        node.left = buildBST(left, mid - 1);
        node.right = buildBST(mid + 1, right);

        return node;
    }

    void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        ls.add(root.data);
        inOrder(root.right);
    }
}
