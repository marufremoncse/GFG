package linkedList;

public class LengthOfALinkedList {
    public int getCount(Node head) {
        // code here
        int count = 0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }
}
