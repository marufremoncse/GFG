package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReversingAQueue {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        Stack<Integer> st = new Stack<>();
        Queue<Integer> resQ = new LinkedList<>();

        if(k>q.size()){
            return q;
        }

        int temp = k;
        while(temp-->0){
            st.push(q.poll());
        }

        while(!st.isEmpty()){
            resQ.offer(st.pop());
        }

        while(!q.isEmpty()){
            resQ.offer(q.poll());
        }

        return resQ;
    }
}
