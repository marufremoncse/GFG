package binarySearchTree;

public class ClosestNeighbourinBST {
    public int findMaxFork(Node root, int k) {
        // code here.
        Node temp = root;
        int res = Integer.MIN_VALUE;
        while(temp!=null){
            if(temp.data==k){
                res = k;
                break;
            }
            if(temp.data>k){
                temp = temp.left;
            } else if (temp.data<k){
                if(temp.data>res){
                    res = temp.data;
                }
                temp = temp.right;
            }
        }
        return res==Integer.MIN_VALUE ? -1: res ;
    }
}
