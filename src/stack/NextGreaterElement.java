package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextGreaterElement {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        int l = arr.length;
        ArrayList<Integer> res = new ArrayList<>(Collections.nCopies(l, -1));
        Stack<Integer> st = new Stack<>();
        for(int i=l-1;i>=0;i--){

            while(!st.empty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(!st.empty()){
                res.set(i, st.peek());
            }

            st.push(arr[i]);
        }
        return res;
    }
}
