package sorting;

public class QuickSort {
    static void quickSort(int arr[], int low, int high)
    {
        // code here
        if(low<high){
            int index = partition(arr, low, high);
            quickSort(arr, low, index-1);
            quickSort(arr, index+1, high);
        }

    }
    static int partition(int arr[], int low, int high)
    {
        // your code here
        int i=low-1;
        int j=low;
        int pivot = arr[high];
        while(j<high){
            if(arr[j]<pivot){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }
}
