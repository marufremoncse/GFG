package arrays;

public class MaximumIndex {
    int maxIndexDiff(int[] arr) {
        // Your code here
        int n = arr.length;
        int minArray[] = new int[n];
        int maxArray[] = new int[n];

        minArray[0] = arr[0];
        maxArray[n-1] = arr[n-1];

        for(int i=1;i<n;i++){
            minArray[i] = Math.min(arr[i], minArray[i-1]);
        }

        for(int i=n-2;i>=0;i--){
            maxArray[i] = Math.max(arr[i], maxArray[i+1]);
        }

        int i=0, j=0;
        int maxIndex = 0;
        while(i<n && j<n){
            if(maxArray[j]>=minArray[i]){
                maxIndex = Math.max(j-i, maxIndex);
                j++;
            } else{
                i++;
            }
        }

        return maxIndex;
    }
}
