package queue;

import java.util.LinkedList;
import java.util.Queue;

class Queues {
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    int size = 0;

    Queues(){
        q1 = new LinkedList<Integer>();
        q2 = new LinkedList<Integer>();
        size = 0;
    }
    void push(int a) {
        q1.offer(a);
        size++;
    }

    int pop() {
        int data = -1;
        if(size>0){
            int temp = size;
            while(temp>1){
                q2.offer(q1.poll());
                temp--;
            }
            data = q1.poll();
            temp = size-1;
            while(temp-->0){
                q1.offer(q2.poll());
            }
            size--;
        }
        return data;
    }
}
