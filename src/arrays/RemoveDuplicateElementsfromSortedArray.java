package arrays;

import java.util.List;

public class RemoveDuplicateElementsfromSortedArray {
    public int remove_duplicate(List<Integer> arr) {
        // Code Here
        int j = 1;
        int prev = arr.get(0);
        for(int i=1;i<arr.size();i++){
            if(arr.get(i)!=prev){
                arr.set(j++, arr.get(i));
                prev = arr.get(i);
            }
        }
        return j;
    }
}
