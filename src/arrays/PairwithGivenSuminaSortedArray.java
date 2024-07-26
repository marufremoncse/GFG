package arrays;

public class PairwithGivenSuminaSortedArray {
    int countPair(int k, int arr[]) {
        // Complete the function
        int count = 0;
        int i=0, j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==k){
                count++;
                i++;
                j--;
            } else if(arr[i]+arr[j]>k){
                j--;
            } else if(arr[i]+arr[j]<k){
                i++;
            }
        }

        return count;
    }
}
