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

    public Node search(int value) {
        return search(value, this);
    }

    public static Node search(int value, Node node) {
        Node focusNode = node;

        while (true) {
            ++counter;
            if (focusNode == null) {
                return null;
            }

            if (value == focusNode.getValue()) {
                return focusNode;
            }

            if (value < focusNode.getValue()) {
                // use left node
                focusNode = focusNode.getLeft();
            } else {
                // use right node
                focusNode = focusNode.getRight();
            }
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
