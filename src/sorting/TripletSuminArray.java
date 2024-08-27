package sorting;

import java.util.HashSet;

public class TripletSuminArray {
    public static boolean find3Numbers(int arr[], int n, int x) {

        // Your code Here
        HashSet<Integer> hs = new HashSet<>();
        for(int num: arr){
            if(!hs.contains(num)){
                hs.add(num);
            }
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int rem = x-arr[i]-arr[j];
                if(hs.contains(rem) && rem!=arr[i] && rem!=arr[j]){
                    //System.out.println(x-arr[i]-arr[j] + " "+ arr[i] + " " + arr[j]);
                    return true;
                }
            }
        }

        return false;
    }
}
