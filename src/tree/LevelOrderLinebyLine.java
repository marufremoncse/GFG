package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderLinebyLine {
    static ArrayList<ArrayList<Integer>> levelOrder(Node node) {
        // Your code here
        if(node==null){
            return new ArrayList<>();
        }
        ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        ls.add(new ArrayList<>(List.of(node.data)));
        q.offer(node);

        while(!q.isEmpty()){
            int levelSize = q.size();
            ArrayList<Integer> curr = new ArrayList<>();

            for(int i=0;i<levelSize;i++){
                Node parent = q.poll();
                if(parent.left!=null){
                    q.offer(parent.left);
                    curr.add(parent.left.data);
                }
                if(parent.right!=null){
                    q.offer(parent.right);
                    curr.add(parent.right.data);
                }
            }
            if(curr.size()>0)
                ls.add(curr);
        }

        return ls;
    }
}
