package nl.gauket;

public class Main {

    public static void main(String[] args) {
        long startCreate = System.currentTimeMillis();

//        BinaryTree binaryTree = new BinaryTree(5000);
//        binaryTree.createRandomTree(5_000_000);
//        binaryTree.addNode(20);


        int x = 10_000;
        BinaryTree binaryTree1 = new BinaryTree(x);
        binaryTree1.createFixedTree(x*2);

        System.out.println("Create binary tree took: " + (System.currentTimeMillis() - startCreate) + " (ms)" + "\n");

        long start = System.currentTimeMillis();

        Node node = binaryTree1.getRoot().find(30);

        System.out.println("Search took: " + (System.currentTimeMillis() - start) + " (ms)");
        System.out.println("Node: " + node.toString());
        System.out.println("Node: " + Node.getCounter());
    }
}
