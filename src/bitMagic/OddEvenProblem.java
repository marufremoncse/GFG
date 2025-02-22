package bitMagic;

import java.util.HashMap;
import java.util.Map;

public class OddEvenProblem {
    public static String oddEven(String s) {
        // code here
        HashMap<Character,Integer> evenMap = new HashMap<Character,Integer>();
        HashMap<Character,Integer> oddMap = new HashMap<Character,Integer>();

        int l = s.length();
        for(int i=0;i<l;i++){
            if(s.charAt(i)%2==0){
                evenMap.put(s.charAt(i), evenMap.getOrDefault(s.charAt(i), 0) + 1);
            } else{
                oddMap.put(s.charAt(i), oddMap.getOrDefault(s.charAt(i), 0) + 1);
            }
        }

        int x = 0, y = 0;

        for(Map.Entry<Character,Integer> entry : evenMap.entrySet()){
            if(entry.getValue()%2==0){
                x++;
            }
        }

        for(Map.Entry<Character,Integer> entry : oddMap.entrySet()){
            if(entry.getValue()%2==1){
                y++;
            }
        }

        return ((x+y) % 2 == 0) ? "EVEN" : "ODD";
    }
}
