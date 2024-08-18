package mathematical;

import java.util.ArrayList;

public class PrintTable {
    static ArrayList<Integer> getTable(int N){
        // code here
        ArrayList<Integer> ls = new ArrayList<>(10);
        for(int i=1;i<=10;i++){
            ls.add(i*N);
        }
        return ls;
    }
}
