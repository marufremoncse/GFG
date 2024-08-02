package stack;

import java.util.Stack;

public class DesignaStackwithGetMin {
    int top = -1;
    int min = Integer.MAX_VALUE;
    public void push(int a,Stack<Integer> s)
    {
        //add code here.
        top++;
        s.push(a);
        if(a<min){
            min = a;
        }
    }
    public int pop(Stack<Integer> s)
    {
        //add code here.
        top--;
        return s.pop();
    }
    public int min(Stack<Integer> s)
    {
        //add code here.
        return min;
    }
    public boolean isFull(Stack<Integer>s, int n)
    {
        //add code here.
        return n==top+1;
    }
    public boolean isEmpty(Stack<Integer>s)
    {
        //add code here.
        return s.isEmpty();
    }
}
