package DoublyAndCircularLinkedLists;

public class DeleteNodeInDoublyLinkedList {
    public Node deleteNode(Node head, int x) {
        if(x==1){
            Node newNode = head.next;
            newNode.prev=null;
            return newNode;
        }

        Node temp = head;
        while(x-->1){
            temp = temp.next;
        }

        temp.prev.next = temp.next;
        if(temp.next!=null){
            temp.next.prev = temp.prev;
        }

        return head;
    }
}
