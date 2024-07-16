package linkedList;

class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}

public class PrintALinkedList {
    void display(Node head) {
        // add code here.
        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}
