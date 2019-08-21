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

    public Node find(int value) {
        return find(value, this);
    }

    public static Node find(int value, Node node) {
        ++counter;

        // check if node exists
        if (node == null) {
            return null;
        }

        // check if this node is the node you're looking for
        if (node.getValue() == value) {
            return node;
        }

        // consider left or right
        if (value > node.getValue()) {
            // right node
            return Node.find(value, node.getRight());
        } else {
            // left node
            return Node.find(value, node.getLeft());
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
