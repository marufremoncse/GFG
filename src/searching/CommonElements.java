package searching;

import java.util.*;

public class CommonElements {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        HashMap<Integer,Integer> hm1 = new HashMap<>();
        HashMap<Integer,Integer> hm2 = new HashMap<>();

        Arrays.stream(a).forEach(i -> hm1.put(i, hm1.getOrDefault(i, 0) + 1));
        Arrays.stream(b).forEach(i -> hm2.put(i, hm2.getOrDefault(i, 0) + 1));

        ArrayList<Integer> res = new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry:hm1.entrySet()){
            if(hm2.containsKey(entry.getKey())){
                int count = Math.min(entry.getValue(), hm2.get(entry.getKey()));

                for(int i=0;i<count;i++){
                    res.add(entry.getKey());
                }
            }
        }
        Collections.sort(res);
        return res;
    }
}
