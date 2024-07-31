package sorting;

public class BubbleSort {
    public static void bubbleSort(int ara[], int n)
    {
        //code here
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(ara[j]>ara[j+1]){
                    int temp = ara[j];
                    ara[j] = ara[j+1];
                    ara[j+1] = temp;
                }
            }
        }
    }
}
