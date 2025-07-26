package binarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class MedianOfBST {
    public static float findMedian(Node root) {
        List<Integer> ls = new ArrayList<>();
        inOrder(root, ls);
        int size = ls.size();

        return size%2==1 ? (float)ls.get(size/2) : (float)(ls.get(size/2) + ls.get((size-1)/2))/2;
    }
    public static void inOrder(Node root, List<Integer> ls){
        if(root==null){
            return;
        }
        inOrder(root.left, ls);
        ls.add(root.data);
        inOrder(root.right, ls);
    }
}
