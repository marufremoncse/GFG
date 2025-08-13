package queue;

import java.util.Stack;

public class ImplementQueueUsingStack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    int size = 0;

    public void push(int B) {
        s1.push(B);
        size++;
    }

    public int pop() {
        int data = -1;
        if(size>0){
            int temp = size;
            while(temp>1){
                s2.push(s1.pop());
                temp--;
            }
            data = s1.pop();
            temp = size-1;
            while(temp-->0){
                s1.push(s2.pop());
            }
            size--;
        }
        return data;
    }
}
