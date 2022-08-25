package BinaryNode;

public class BinaryNode<T> {
    private T value;
    private BinaryNode<T> left, right;

    /**
     * Default constructor
     */
    public BinaryNode() {
        value = null;
        left = null;
        right = null;
    }

    public BinaryNode(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    /**
     *
     * @return value
     */
    public T getValue() {
        return value;
    }

    /**
     *
     * @return left BinaryNode
     */
    public BinaryNode<T> getLeft() {
        return this.left;
    }

    /**
     *
     * @return right BinaryNode
     */
    public BinaryNode<T> getRight() {
        return this.right;
    }

    /**
     * Sets the value
     * @param value
     */
    public void setValue(T value) {
        this.value = value;
    }

    /**
     * Sets left BinaryNode
     * @param left
     */
    public void setLeft(BinaryNode<T> left) {
        this.left = left;
    }

    /**
     * Sets right BinaryNode
     * @param right
     */
    public void setRight(BinaryNode<T> right) {
        this.right = right;
    }
}
