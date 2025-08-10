package mathematical;

import java.util.HashSet;

public class PerfectNumbers {
    static boolean isPerfect(int n) {
        HashSet<Integer> hs = new HashSet<>();

        for(int i=1;i*i<n;i++){
            if(n%i==0){
                hs.add(i);
                hs.add(n/i);
            }
        }

        int sum = 0;
        sum = hs.stream().mapToInt(Integer::intValue).sum();

        return sum - n == n;
    }
}
