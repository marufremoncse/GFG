package searching;

public class FloorinaSortedArray {
    static int findFloor(long arr[], int n, long x) {
        long max = Long.MIN_VALUE;
        int index = -1;

        for(int i=0;i<n;i++){
            if(arr[i]<=x && max<arr[i]){
                max = arr[i];
                index = i;
            }
        }

        return index;
    }
}
