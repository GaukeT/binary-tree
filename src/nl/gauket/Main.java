package nl.gauket;

public class Main {

    public static void main(String[] args) {
        long startCreate = System.currentTimeMillis();

        int rootValue = 10_000;
        BinaryTree binaryTree = new BinaryTree(rootValue);
        binaryTree.createFixedTree(rootValue*2);

//        binaryTree.createRandomTree(rootValue*100);
//        binaryTree.addNode(30);

        System.out.println("Create binary tree took: " + (System.currentTimeMillis() - startCreate) + " (ms)" + "\n");

        long start = System.currentTimeMillis();

        Node node = binaryTree.getRootNode().find(30);

        System.out.println("Search took: " + (System.currentTimeMillis() - start) + " (ms)");
        System.out.println("Node: " + node.toString());
        System.out.println("Node: " + Node.getCounter());
    }
}
