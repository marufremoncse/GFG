package searching;

public class PeakElement {
    public int peakElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        int index = -1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
}
