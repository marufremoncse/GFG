import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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

    public static int TotalPairs(int[] nums, int k) {
        // Code here
        List<Integer> ls = new ArrayList<Integer>();
        int count = 0;
        for(int i:nums){
            ls.add(i);
        }

        Iterator<Integer> it = ls.iterator();
        int nextToRemove = -1;

        while(it.hasNext()){
            int i = it.next();

            if(ls.contains(k+i)){
                count++;

                it.remove();

                nextToRemove = k+i;
            } else if(i==nextToRemove){
                it.remove();
                nextToRemove = -1;
            }
        }

        return count;
    }

    static class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

    static Node sortedInsert(Node head1, int key) {
        // Add your code here.

        Node insertNode = new Node(key);

        if(head1==null){
            return insertNode;
        } else if(head1.data>=key){
            insertNode.next = head1;
            return insertNode;
        }

        Node temp = head1;

        while(temp!=null){
            if(temp.data<=key){
                if(temp.next!=null && temp.next.data>=key){
                    insertNode.next = temp.next;
                    temp.next = insertNode;
                } else if(temp.next==null){
                    temp.next = insertNode;
                }
                break;
            }
            temp = temp.next;
        }


        return head1;
    }

    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(4);

        //System.out.println(remove_duplicate(ls));
        int[] arr = {1, 5, 4, 1, 2};
        //System.out.println(findNumberOfTriangles(arr, 5));
        System.out.println(TotalPairs(arr, 0));
        System.out.println("Hello World");

        Node f = new Node(50);
        Node s = new Node(100);
        f.next = s;

        Node res = sortedInsert(f, 175);

        while(res!=null){
            System.out.println(res.data);
            res = res.next;
        }

        Arrays.sort(arr);

        pattern(10);
    }
    public static ArrayList<Integer> pattern(int n) {
        // code here
        ArrayList<Integer> ls = new ArrayList<>();
        pattern(n, ls);
        return ls;
    }
    public static void pattern(int n, ArrayList<Integer> ls) {
        if(n<=0){
            ls.add(n);
            return;
        }
        ls.add(n);
        pattern(n-5, ls);
        ls.add(n);
    }

}
