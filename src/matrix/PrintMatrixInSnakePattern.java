package matrix;

import java.util.ArrayList;

public class PrintMatrixInSnakePattern {
    static ArrayList<Integer> snakePattern(int matrix[][])
    {
        // code here
        ArrayList<Integer> ls = new ArrayList<Integer>();
        int l = matrix[0].length;
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                if(i%2==0)
                {
                    ls.add(matrix[i][j]);
                } else{
                    ls.add(matrix[i][l-1-j]);
                }
            }
        }

        return ls;
    }
}
