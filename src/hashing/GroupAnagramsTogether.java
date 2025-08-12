package hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GroupAnagramsTogether {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        Map<String, ArrayList<String>> mp = new HashMap<>();
        for(String s:arr){
            String sortedString = sortString(s);
            mp.computeIfAbsent(sortedString, k->new ArrayList<>()).add(s);
        }

        for(ArrayList<String> ls:mp.values()){
            res.add(ls);
        }

        return res;
    }

    public String sortString(String s){
        char[] temp = s.toCharArray();
        Arrays.sort(temp);

        return new String(temp);
    }
}
