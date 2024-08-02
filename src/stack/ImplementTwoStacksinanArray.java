package stack;

public class ImplementTwoStacksinanArray {
    int ara[] = new int[200];
    int top1 = -1;
    int top2 = 99;
//    twoStacks() {
//
//    }

    // Function to push an integer into the stack1.
    void push1(int x) {
        ara[++top1] = x;
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        ara[++top2] = x;
    }

    // Function to remove an element from top of the stack1.
    int pop1() {
        if(top1!=-1){
            int res = ara[top1];
            top1--;
            return res;
        }
        return -1;
    }

    // Function to remove an element from top of the stack2.
    int pop2() {
        if(top2!=99){
            int res = ara[top2];
            top2--;
            return res;
        }
        return -1;
    }
}
