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

    static int findNumberOfTriangles(int arr[], int n)
    {
        // code here
        int count = 0;
        int l = arr.length;

        for(int i=0;i<=l-3;i++){
            int a = arr[i];
            for(int j=i+2;j<l;j++){
                int b = arr[j+1];
                int c = arr[j];

                if(a+b>c && b+c>a && c+a>b){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(4);

        //System.out.println(remove_duplicate(ls));
        int[] arr = {6,4,9,7,8};
        System.out.println(findNumberOfTriangles(arr, 5));
    }
}
