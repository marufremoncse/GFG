package divideAndConquer;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public double findMedian(int[] arr) {
        Arrays.sort(arr);
        int l = arr.length;
        return l%2==0 ? (double)(arr[l/2] + arr[(l/2)-1])/2 : arr[l/2];
    }
}
