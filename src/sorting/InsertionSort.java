package sorting;

public class InsertionSort {
    public void insertionSort(int arr[], int n)
    {
        //code here
        int i = 1;
        while(i<n){
            int j = i-1;
            int key = arr[i];

            while(j>=0 && arr[j]>key){
                if(key<arr[j]){
                    arr[j+1] = arr[j];
                }
                j--;
            }
            arr[++j] = key;
            i++;
        }
    }
}
