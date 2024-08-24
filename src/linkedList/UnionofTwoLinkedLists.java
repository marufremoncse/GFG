package linkedList;

import java.util.*;

public class UnionofTwoLinkedLists {
    public static Node findUnion(Node head1, Node head2) {
        // Add your code here.
        Set<Integer> st = new HashSet<>();

        while(head1!=null){
            if(!st.contains(head1.data)){
                st.add(head1.data);
            }
            head1=head1.next;
        }

        while(head2!=null){
            if(!st.contains(head2.data)){
                st.add(head2.data);
            }
            head2=head2.next;
        }
        List<Integer> list = new ArrayList<>(st);
        Collections.sort(list);

        Node head = new Node(0);
        Node res = head;
        for(int num:list){
            Node newNode = new Node(num);
            head.next = newNode;
            head = head.next;
        }

        return res.next;
    }
}
