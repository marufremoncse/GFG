package arrays;

public class WaveArray {
    public static void convertToWave(int n, int[] arr) {
        // code here
        for(int i=0;i<n;i+=2){
            if(i<n && i+1<n){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }
}
