package searching;

import java.util.ArrayList;

public class LinearSearch {
    public int search(int k, ArrayList<Integer> arr) {
        // code here

        for(int i = 0;i<arr.size();i++){
            if(arr.get(i)==k){
                return i+1;
            }
        }
        return -1;
    }
}