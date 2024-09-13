package arrays;

public class RotateArray {
    static void rotateArr(int arr[], int d, int n) {
        // add your code here
        d = d%n;
        arr = helper(arr, 0, n-1);
        arr = helper(arr, 0, n-d-1);
        arr = helper(arr, n-d, n-1);
    }

    static int[] helper(int arr[], int l, int r) {
        while(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }


        return arr;
    }
}
