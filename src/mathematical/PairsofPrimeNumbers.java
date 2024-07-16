package mathematical;

import java.util.ArrayList;

public class PairsofPrimeNumbers {
    public int[] prime_pairs(int n)
    {
        // Code here
        int[] ara = new int[n+1];

        for(int i=2;i*i<=n;i++){
            for(int j=i*2;j<=n;j+=i){
                ara[j] = 1;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=2;i<=n;i++){
            for(int j=2;j<=n;j++){
                if(ara[i]==0 && ara[j]==0 && i*j<=n){
                    list.add(i);
                    list.add(j);
                }
            }

        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            res[i] = list.get(i);

        return res;
    }
}
