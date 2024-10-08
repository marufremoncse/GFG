package searching;

public class BinarySearch {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int l = 0, h = arr.length - 1;

        while(l<=h){
            int mid = l + (h-l)/2;

            if(arr[mid]==k){
                return mid;
            } else if(arr[mid]>k){
                h = mid - 1;
            } else if(arr[mid]<k){
                l = mid + 1;
            }
        }

        return -1;
    }
}
