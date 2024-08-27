package sorting;

import java.util.HashSet;

public class CounttheTriplets {
    int countTriplet(int arr[], int n) {
        // code here
        int count = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int num: arr){
            if(!hs.contains(num)){
                hs.add(num);
            }
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(hs.contains(arr[i]+arr[j])){
                    count++;
                }
            }
        }

        return count;
    }
}
