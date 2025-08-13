package DoublyAndCircularLinkedLists;

class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}

public class InsertANodeInDoublyLinkedList {
    Node addNode(Node head, int p, int x) {
        Node newNode = new Node(x);
        if(head==null){
            return newNode;
        }

        Node temp = head;

        while(p-->0){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        newNode.prev = temp;

        return head;
    }
}
