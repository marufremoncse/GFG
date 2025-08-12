package searching;

public class SearchInRotatedSortedArray {
    int search(int[] arr, int key) {
        int index = -1;
        int low = 0, high = arr.length-1;

        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr[mid]==key){
                index = mid;
                break;
            } else if(arr[low]<=arr[mid]){
                if(key<arr[mid] && key>=arr[low]){
                    high = mid - 1;
                } else{
                    low = mid + 1;
                }
            } else if(arr[mid]<=arr[high]){
                if(key>arr[mid] && key<=arr[high]){
                    low = mid + 1;
                } else{
                    high = mid - 1;
                }
            }
        }

        return index;
    }
}
