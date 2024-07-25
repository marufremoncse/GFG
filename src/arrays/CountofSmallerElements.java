package arrays;

import java.util.List;

public class CountofSmallerElements {
    public int countOfElements(int x, List<Integer> arr) {
        // Code here
        int count = 0;
        for(int val:arr){
            if(val<=x)
                count++;
        }
        return count;
    }
}
