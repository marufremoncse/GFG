package sorting;

import java.util.HashSet;

public class TripletFamily {
    public boolean findTriplet(int[] arr) {
        boolean flag = false;
        HashSet<Integer> hs = new HashSet<>();
        for(int num: arr){
            if(!hs.contains(num)){
                hs.add(num);
            }
        }
        int l = arr.length;

        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                if(hs.contains(arr[i]+arr[j])){
                    flag = true;
                    break;
                }
            }
        }

        return flag;
    }
}
