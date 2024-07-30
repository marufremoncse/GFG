package arrays;

import java.util.Iterator;
import java.util.List;

public class ArrayOperations {
    public boolean searchEle(List<Integer> arr, int x) {
        // add code here.
        return arr.indexOf(x)!=-1;
    }

    public boolean insertEle(List<Integer> arr, int y, int yi) {
        // add code here.

        arr.add(yi, y);
        return true;

    }

    public boolean deleteEle(List<Integer> arr, int z) {
        // add code here.
        Iterator itr = arr.iterator();
        while (itr.hasNext())
        {
            int data = (Integer)itr.next();
            if (data == z) {
                itr.remove();
                return true;
            }

        }
        return false;
    }
}
