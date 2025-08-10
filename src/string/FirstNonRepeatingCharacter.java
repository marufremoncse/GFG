package string;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public char nonRepeatingChar(String s) {
        Map<Character, Integer> hm = new LinkedHashMap<>();

        for(char c:s.toCharArray()){
            hm.put(c, hm.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> entry: hm.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }

        return '$';
    }
}
