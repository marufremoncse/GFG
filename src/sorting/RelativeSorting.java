package sorting;

import java.util.*;

public class RelativeSorting {
    static int[] relativeSort(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Map<Integer,Integer> hm = new HashMap<>();
        Set<Integer> hs = new LinkedHashSet<>();
        Arrays.stream(arr1).forEach(e->hm.put(e, hm.getOrDefault(e, 0) + 1));
        Arrays.stream(arr2).filter(hs::add).forEach(e -> {});;
        int[] temp = new int[arr1.length];
        int i=0;
        for(int num:hs){
            if(hm.containsKey(num)){
                int count = hm.get(num);
                while(count-- > 0){
                    temp[i++] = num;
                }
            }
        }
        for(int j=0; j<arr1.length; j++){
            if(!hs.contains(arr1[j])){
                temp[i++] = arr1[j];
            }
        }

        for (int k = 0; k < i; k++) {
            arr1[k] = temp[k];
        }

        return arr1;
    }
}
