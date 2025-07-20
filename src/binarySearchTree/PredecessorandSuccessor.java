package binarySearchTree;

import java.util.ArrayList;

public class PredecessorandSuccessor {
    public ArrayList<Node> findPreSuc(Node root, int key) {
        // code here
        ArrayList<Node> res = new ArrayList<>();
        res.add(new Node(-1));
        res.add(new Node(-1));

        findPreSuc(root, key, res);

        return res;
    }

    public void findPreSuc(Node root, int key, ArrayList<Node> res) {
        if(root==null)
            return;

        if(root.data>res.get(0).data && root.data<key){
            res.get(0).data = root.data;
        }
        else if(root.data>key){
            if(res.get(1).data==-1){
                res.get(1).data = root.data;
            } else if(root.data<res.get(1).data){
                res.get(1).data = root.data;
            }
        }
        findPreSuc(root.left, key, res);
        findPreSuc(root.right, key, res);

    }
}
