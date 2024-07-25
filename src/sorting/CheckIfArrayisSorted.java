package sorting;

import java.util.List;

public class CheckIfArrayisSorted {
    public boolean arraySortedOrNot(List<Integer> arr) {
        // code here
        int l = arr.size();
        if(l<2){
            return true;
        }

        for(int i=0;i<l-1;i++){
            if(arr.get(i)>arr.get(i+1)){
                return false;
            }
        }
        return true;
    }
}
