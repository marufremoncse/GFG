package matrix;

public class CountZerosinaSortedMatrix {
    int countZeros(int A[][], int N)
    {
        // Your code here
        int res = 0;
        int i = 0, j = 0;
        for(int p=0;p<N*N;p++){
            if(A[i][j]==0){
                res++;
            }
            if(++j==N){
                j=0;
                i++;
            }
        }

        return res;
    }
}
