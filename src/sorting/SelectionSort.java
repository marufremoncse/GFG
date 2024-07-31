package sorting;

public class SelectionSort {
    void selectionSort(int ara[], int n)
    {
        //code here
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(ara[i]>ara[j]){
                    int temp = ara[j];
                    ara[j] = ara[i];
                    ara[i] = temp;
                }
            }
        }
    }
}
