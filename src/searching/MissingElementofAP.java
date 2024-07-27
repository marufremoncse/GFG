package searching;

public class MissingElementofAP {
    int findMissing(int[] arr) {
        // code here

        int n = arr.length;
        int diff = (arr[n-1]-arr[0])/n;
        int res = 0;
        for(int i=0;i<n;i++){
            if(arr[i]!=(diff*i)+arr[0]){
                res = (diff*i)+arr[0];
                break;
            }
        }
        return res;
    }
}
