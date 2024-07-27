package searching;

import java.util.Arrays;

public class FindtheMissingNumber {
    public static int missingNumber(int n, int[] arr) {
        // code here
        int sum = Arrays.stream(arr).sum();

        return n*(n+1)/2 - sum;
    }
}
