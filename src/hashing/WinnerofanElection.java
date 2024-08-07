package hashing;

import java.util.HashMap;
import java.util.Map;

public class WinnerofanElection {
    public static String[] winner(String arr[], int n)
    {
        // add your code
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        String res = "";

        int max = Integer.MIN_VALUE;
        int tempVote = 0;
        for(String name: arr){
            tempVote = map.getOrDefault(name, 0) + 1;

            if(tempVote>max){
                max = tempVote;
                res = name;
            }

            map.put(name, tempVote);
        }

        for(Map.Entry<String, Integer> entry: map.entrySet()){
            String key = entry.getKey();
            int value = entry.getValue();

            if(value==max && res.compareTo(key)>0){
                res = key;
            }
        }

        return new String[]{res, String.valueOf(max)};
    }
}
