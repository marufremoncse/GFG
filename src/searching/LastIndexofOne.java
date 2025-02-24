package searching;

public class LastIndexofOne {
    public int lastIndex(String s) {
        int index = -1;
        int l = s.length();
        for(int i=0;i<l;i++){
            if(s.charAt(i)=='1'){
                index = i;
            }
        }
        return index;
    }
}
