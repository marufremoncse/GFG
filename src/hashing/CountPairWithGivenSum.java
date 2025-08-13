package hashing;

import java.util.*;

public class CountPairWithGivenSum {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        Set<Integer> set = new HashSet<>();
        Arrays.stream(arr).forEach(set::add);
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int countZero = 0;
        for(int num:arr){
            if(num==0){
                countZero++;
            }
        }


        for(int num:arr){
            if(set.contains(num) && set.contains(-num) && num!=0){
                ArrayList<Integer> ls = new ArrayList<>(List.of(num, -num));
                res.add(ls);
                set.remove(num);
                set.remove(-num);
            }
        }

        for(int i=0;i<(countZero/2);i++){
            ArrayList<Integer> ls = new ArrayList<>(List.of(0, 0));
            res.add(ls);
        }

        return res;
    }
}
