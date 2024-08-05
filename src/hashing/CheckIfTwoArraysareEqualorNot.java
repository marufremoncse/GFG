package hashing;

import java.util.HashMap;
import java.util.Map;

public class CheckIfTwoArraysareEqualorNot {
    public static boolean check(int[] arr1, int[] arr2) {
        // Your code here

        HashMap<Integer,Integer> hm1 = new HashMap<>();
        HashMap<Integer,Integer> hm2 = new HashMap<>();

        for(int num:arr1){
            hm1.put(num, hm1.getOrDefault(num, 0)+1);
        }

        for(int num:arr2){
            hm2.put(num, hm2.getOrDefault(num, 0)+1);
        }

        for(Map.Entry<Integer,Integer> entry: hm1.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();

            if(!hm2.containsKey(key) || value!=hm2.get(key)){
                return false;
            }
        }
        return true;
    }
}
