import java.util.ArrayList;
import java.util.List;

public class Playground {
    public static int remove_duplicate(List<Integer> arr) {
        // Code Here
        int j = 1;
        int prev = arr.get(0);
        for(int i=1;i<arr.size();i++){
            if(arr.get(i)!=prev){
                arr.set(j++, arr.get(i));
                prev = arr.get(i);
            }
        }
        return j;
    }

    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(4);

        System.out.println(remove_duplicate(ls));
    }
}
