package sorting;

import java.util.Arrays;
import java.util.HashMap;

public class MinimumSwapsToSort {
    public int minSwaps(int arr[]) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int l = arr.length;
        for(int i=0;i<l;i++){
            hm.put(arr[i],i);
        }
        int res = 0;
        int[] visited = new int[l];
        Arrays.sort(arr);

        for(int i=0;i<l;i++){
            if(visited[i]==1){
                continue;
            }

            int cycleCount=0;
            int temp = i;
            while(visited[temp]!=1){
                visited[temp]=1;
                temp = hm.get(arr[temp]);
                cycleCount++;
            }
            res+=cycleCount-1;
        }

        return res;
    }
}
