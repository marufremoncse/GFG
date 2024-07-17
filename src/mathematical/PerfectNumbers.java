package mathematical;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PerfectNumbers {
    static int isPerfectNumber(long N) {
        // code here
        long sum = 0;
        Set<Long> hs = new HashSet<>();
        for(long i=1;i*i<=N;i++){
            if(N%i==0){
                hs.add(i);
                hs.add(N/i);
            }
        }

        Iterator it = hs.iterator();

        while(it.hasNext()){
            sum+=(long)it.next();
        }

        return (sum-N)==N? 1 : 0;
    }
}
