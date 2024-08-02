package stack;

public class ImplementStackUsingArray {
    private int[] arr;
    private int top;

    public ImplementStackUsingArray() {
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) {
        // Your Code
        arr[++top] = x;
    }

    public int pop() {
        // Your Code
        if(top!=-1){
            return arr[top--];
        }
        return -1;
    }
}
