package stack;

import java.util.ArrayList;
import java.util.List;

public class ImplementStackUsingLinkedList {
     class StackNode {
         int data;
         StackNode next;
         StackNode(int a) {
             data = a;
             next = null;
         }
     }
    StackNode top;
    List<StackNode> ls = new ArrayList<>();
    int up = -1;

    // Function to push an integer into the stack.
    void push(int a) {
        // Add your code here
        up++;
        StackNode sn = new StackNode(a);
        ls.add(sn);
    }

    // Function to remove an item from top of the stack.
    int pop() {
        // Add your code here
        if(up!=-1){
            int res = ls.get(up).data;
            ls.remove(up--);

            return res;
        }
        return -1;
    }
}
