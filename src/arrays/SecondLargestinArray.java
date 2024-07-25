package arrays;

import java.util.List;

public class SecondLargestinArray {
    public int print2largest(List<Integer> arr) {
        // Code Here
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int val:arr){
            if(val>max){
                secondMax = max;
                max = val;
            }
            else if(val<max && val>secondMax){
                secondMax = val;
            }
        }
        return secondMax!=Integer.MIN_VALUE ? secondMax : -1;
    }
}
