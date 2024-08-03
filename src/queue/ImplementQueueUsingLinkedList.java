package queue;

import java.util.ArrayList;
import java.util.List;

public class ImplementQueueUsingLinkedList {

    class QueueNode
    {
        int data;
        QueueNode next;
        QueueNode(int a)
        {
            data = a;
            next = null;
        }
    }
    int front=0, rear=0;
    List<QueueNode> ls = new ArrayList<>();
    //Function to push an element into the queue.
    void push(int a)
    {
        // Your code here
        QueueNode qn = new QueueNode(a);
        ls.add(qn);
        rear++;
    }

    //Function to pop front element from the queue.
    int pop()
    {
        // Your code here
        if(front!=rear){
            QueueNode qn = ls.get(front++);

            return qn.data;
        }

        return -1;
    }
}
