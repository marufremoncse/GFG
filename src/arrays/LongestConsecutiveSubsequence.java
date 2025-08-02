package arrays;

public class LongestConsecutiveSubsequence {
    public int longestConsecutive(int[] arr) {
        int max = 0, count = 0;
        int size = 100001;
        int [] countTable = new int[size];

        for(int i=0;i<arr.length;i++){
            countTable[arr[i]]++;
        }

        for(int i=0;i<size;i++){
            if(countTable[i] != 0){
                count++;
            } else{
                max = Math.max(max, count);
                count = 0;
            }
        }

        return max;
    }
}
