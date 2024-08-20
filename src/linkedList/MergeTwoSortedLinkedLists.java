package linkedList;

public class MergeTwoSortedLinkedLists {
    Node sortedMerge(Node head1, Node head2) {
        // This is a "method-only" submission.
        // You only need to complete this method
        Node head = new Node(0);
        Node temp = head;
        Node temp1 = head1;
        Node temp2 = head2;
        while(temp1!=null && temp2!=null){
            if(temp1.data<=temp2.data){
                Node newNode = new Node(temp1.data);
                temp.next = newNode;
                temp = temp.next;
                temp1 = temp1.next;
            } else{
                Node newNode = new Node(temp2.data);
                temp.next = newNode;
                temp = temp.next;
                temp2 = temp2.next;
            }

        }

        while(temp1!=null){
            Node newNode = new Node(temp1.data);
            temp.next = newNode;
            temp = temp.next;
            temp1 = temp1.next;
        }

        while(temp2!=null){
            Node newNode = new Node(temp2.data);
            temp.next = newNode;
            temp = temp.next;
            temp2 = temp2.next;
        }

        return head.next;
    }
}
