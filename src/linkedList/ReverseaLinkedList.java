package linkedList;

public class ReverseaLinkedList {
    Node reverseList(Node head) {
        // code here
        Node preNode = null;
        Node currNode = head;

        while(currNode!=null){
            Node nextNode = currNode.next;
            currNode.next = preNode;
            preNode = currNode;
            currNode = nextNode;
        }

        return preNode;
    }
}
