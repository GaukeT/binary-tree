package nl.gauket;

public class Node {

    private static int counter = 0;

    private int value;
    private Node left;
    private Node right;

    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public static int getCounter() {
        return counter;
    }

    public Node find(int v) {
        ++counter;
        if (this.value != v) {
            if (v > this.value) {
                // choose right
                if (this.right != null) {
                    return this.right.find(v);
                }
            } else {
                // choose left
                if (this.left != null) {
                    return this.left.find(v);
                }
            }

            return null;

        } else {
            return this;
        }
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
