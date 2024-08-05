package hashing;

import java.util.HashMap;

public class CountFrequenciesofElements {
    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int num: arr){
            hm.put(num, hm.getOrDefault(num, 0)+1);
        }

        for(int i=0;i<N;i++){
            arr[i] = hm.getOrDefault(i+1, 0);
        }
    }
}
