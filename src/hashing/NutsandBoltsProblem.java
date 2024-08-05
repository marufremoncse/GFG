package hashing;

import java.util.HashSet;

public class NutsandBoltsProblem {
    void matchPairs(int n, char nuts[], char bolts[]) {
        // code here
        HashSet<Character> hs = new HashSet<>();
        char[] st = { '!','#','$','%','&','*','?','@','^' };

        for(char c: nuts){
            hs.add(c);
        }

        int i=0;
        for(char c: st){
            if(hs.contains(c)){
                nuts[i] = c;
                bolts[i++] = c;
            }
        }
    }
}
