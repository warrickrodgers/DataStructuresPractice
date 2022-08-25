package ListNode;

public class ListNode<T> {
    T value;
    ListNode next;

    /**
     * Default constructor
     */
    public ListNode() {
        this.value = value;
        this.next = null;
    }

    /**
     *
     * @param value
     */
    public ListNode(T value) {
        this.value = value;
        this.next = null;
    }

    /**
     * Custom constructor that sets next value
     * @param value
     * @param next
     */
    public ListNode(T value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    /**
     *
     * @return value
     */
    public T getValue() {
        return this.value;
    }

    /**
     *
     * @return next ListNode element
     */
    public ListNode getNext() {
        return this.next;
    }

    /**
     * Sets the next ListNode element
     * @param next
     */
    public void setNext(ListNode next) {
        this.next = next;
    }
}
