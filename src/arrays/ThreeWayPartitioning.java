package arrays;

public class ThreeWayPartitioning {
    public void threeWayPartition(int array[], int a, int b)
    {
        // code here
        int n = array.length;
        int[] temp = new int[n];
        int k = 0;
        for(int i=0;i<n;i++){
            if(array[i]<a){
                temp[k++] = array[i];
            }
        }

        for(int i=0;i<n;i++){
            if(array[i]>=a && array[i]<=b){
                temp[k++] = array[i];
            }
        }

        for(int i=0;i<n;i++){
            if(array[i]>b){
                temp[k++] = array[i];
            }
        }

        for(int i=0;i<n;i++){
            array[i] = temp[i];
        }
    }
}
