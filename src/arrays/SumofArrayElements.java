package arrays;

import java.util.Arrays;

public class SumofArrayElements {
    int sum(int arr[]) {
        // code here
        return Arrays.stream(arr).sum();
    }
}
