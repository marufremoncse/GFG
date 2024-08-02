package sorting;

public class SortanArrayWhenTwoHalvesareSorted {
    public static void sortHalves (int arr[], int n)
    {
        // your code here
        int temp[] = new int[n];

        int index = -1, k = 0;

        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                index = i;
                break;
            }
        }
        if(index!=-1){
            int p = 0, q = index;

            while(p<index && q<n){
                if(arr[p]<arr[q]){
                    temp[k++] = arr[p++];
                } else{
                    temp[k++] = arr[q++];
                }
            }

            while(p<index){
                temp[k++] = arr[p++];
            }

            while(q<n){
                temp[k++] = arr[q++];
            }

            for(int i = 0;i<n;i++){
                arr[i] = temp[i];
            }
        }
    }
}
