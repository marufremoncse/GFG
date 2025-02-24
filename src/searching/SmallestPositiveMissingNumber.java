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

    public int missingNumber(int[] arr) {
        int l = arr.length;
        int[] indexArray = new int[l+1];

        for(int i=0;i<l;i++){
            if(arr[i]>0 && arr[i]<=l){
                indexArray[arr[i]-1] = 1;
            }
        }

        int minimumPositive = -1;

        for(int i=0;i<=l;i++){
            if(indexArray[i]==0){
                minimumPositive = i+1;
                break;
            }
        }
        return minimumPositive;
    }
}
