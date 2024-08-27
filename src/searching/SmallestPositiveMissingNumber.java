package searching;

import java.util.HashSet;

public class SmallestPositiveMissingNumber {
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        int ans = 1;
        HashSet<Integer> st = new HashSet<>();
        for(int num: arr){
            if(!st.contains(num)){
                st.add(num);
            }
        }
        for(int i=1;i<=1000000;i++){
            if(!st.contains(i)){
                ans = i;
                break;
            }
        }

        return ans;
    }
}
