package matrix;

public class FindtheRowwithMaximumNumberof1s {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int row = arr.length;
        int col = arr[0].length;

        int i = 0, j = 0, count = 0, max = 0, resIndex = -1;

        while(i<row){
            if(arr[i][j++]==1){
                count++;
            }

            if(j==col){
                if(count>max){
                    max = count;
                    resIndex = i;
                }
                count = 0;
                j = 0;
                i++;
            }
        }

        return resIndex;
    }
}
