package matrix;

import java.util.Arrays;

public class MedianInaRowWiseSortedMatrix {
    int median(int matrix[][], int R, int C) {
        // code here
        int[] res = new int[R*C];
        int k = 0;

        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                res[k++] = matrix[i][j];
            }
        }

        Arrays.sort(res);

        return res[(R*C)/2];
    }
}
