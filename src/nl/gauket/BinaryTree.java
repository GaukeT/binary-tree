package nl.gauket;

import java.util.Random;

public class BinaryTree {

    private Node root;

    public BinaryTree(int rootValue) {
        this.root = new Node(rootValue);
    }

    public Node getRootNode() {
        return root;
    }

    public void addNode(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
        } else {
            Node focusNode = root;
            Node parent;

            while (true) {
                parent = focusNode;

                // TODO: use 'find(value)' method for check on duplicate value + extract from loop
                if (value ==  focusNode.getValue()) {
                    System.out.println("Value already exist in tree: " + value);
                    break;
                }

                if (value < focusNode.getValue()) {
                    // use left node
                    focusNode = focusNode.getLeft();
                    if (focusNode == null) {
                        parent.setLeft(newNode);
                        break;
                    }
                } else {
                    // use right node
                    focusNode = focusNode.getRight();
                    if (focusNode == null) {
                        parent.setRight(newNode);
                        break;
                    }
                }
            }
        }
    }

    public void createRandomTree(int height) {
        for (int i = 0; i <= height; i++) {
            int value = new Random().nextInt(Integer.MAX_VALUE);
            this.addNode(value);
        }
    }

    public void createFixedTree(int height) {
        int node = height;
        for (int i = 1; i <= height; i++) {
            this.addNode(node);
            node--;
        }
    }
}



