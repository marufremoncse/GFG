package linkedList;

public class MiddleOfALinkedList {
    int getMiddle(Node head) {
        // Your code here.
        Node firstPointer = new Node(0);
        Node secondPointer = new Node(0);

        firstPointer = head;
        secondPointer = head;

        while(secondPointer.next!=null && secondPointer.next.next!=null){
            firstPointer = firstPointer.next;
            secondPointer = secondPointer.next.next;
        }
        if(secondPointer.next!=null){
            firstPointer = firstPointer.next;
        }

        return firstPointer.data;
    }
}
