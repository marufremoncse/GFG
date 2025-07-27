package recursion;

import java.util.ArrayList;

public class PrintPattern {
    public ArrayList<Integer> pattern(int n) {
        ArrayList<Integer> ls = new ArrayList<>();
        pattern(n, ls);
        return ls;
    }
    public void pattern(int n, ArrayList<Integer> ls) {
        if(n<=0){
            ls.add(n);
            return;
        }
        ls.add(n);
        pattern(n-5, ls);
        ls.add(n);
    }
}
