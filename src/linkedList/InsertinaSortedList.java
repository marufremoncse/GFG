package linkedList;

public class InsertinaSortedList {
    Node sortedInsert(Node head1, int key) {
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
                    break;
                } else if(temp.next==null){
                    temp.next = insertNode;
                    break;
                }

            }
            temp = temp.next;
        }


        return head1;
    }
}
