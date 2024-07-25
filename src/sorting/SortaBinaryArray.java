package sorting;

public class SortaBinaryArray {
    static void binSort(int A[], int N)
    {
        // add your code here


        /**************
         * No need to print the array
         * ************/
        int i = 0, j = 0;

        while(j!=N){
            if(A[i]==0){
                i++;
            }
            else if(A[i]==1 && A[j]==0){
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;

                i++;
            }
            j++;
        }
    }
}
