package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        if(root==null){
            return new ArrayList<>();
        }

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        Queue<Node> q = new LinkedList<>();

        q.add(root);
        res.add(new ArrayList<>(List.of(root.data)));

        while(!q.isEmpty()){
            int count = q.size();
            ArrayList<Integer> curr = new ArrayList<>();
            while(count-->=1){
                Node node = q.remove();
                if(node.left!=null) {
                    q.add(node.left);
                    curr.add(node.left.data);
                }
                if(node.right!=null) {
                    q.add(node.right);
                    curr.add(node.right.data);
                }
            }
            res.add(curr);
        }

        return res;
    }
}
