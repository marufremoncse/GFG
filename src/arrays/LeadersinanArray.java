package arrays;

import java.util.ArrayList;
import java.util.Stack;

public class LeadersinanArray {
    static ArrayList<Integer> leaders(int n, int arr[]) {
        // Your code here
        int l = arr.length;
        ArrayList<Integer> ls = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        int currMax = Integer.MIN_VALUE;

        for(int i=l-1;i>=0;i--){
            if(arr[i]>=currMax){
                currMax = arr[i];
                st.push(currMax);
            }
        }

        while(!st.isEmpty()){
            ls.add(st.pop());
        }
        return ls;
    }
}
