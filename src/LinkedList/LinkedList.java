package LinkedList;


import ListNode.ListNode;

public class LinkedList<T> {


    public ListNode<T> head;
    public ListNode<T> tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addNode(T value) {
        ListNode<T> newListNode = new ListNode<>(value);

        //if the linked list is empty
        if(head == null) {
            head = newListNode;
            tail = newListNode;
        }

        //else there is data, insert at end
        else {
            tail.setNext(newListNode);
            tail = newListNode;
        }
    }

    public void displayLinkedList() {
        ListNode<T> current = head;

        while(current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
}
