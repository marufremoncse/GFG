package linkedList;

public class NodeAtAGivenIndexInLinkedList {
    public int GetNth(Node head, int index) {
        // Code here
        while(head!=null){
            if(--index==0){
                return head.data;
            }
            head = head.next;
        }

        return -1;
    }
}
