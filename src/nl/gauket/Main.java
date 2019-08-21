package nl.gauket;

public class Main {

    public static void main(String[] args) {
        int rootValue = 50_000;

        BinaryTree fixedBinaryTree = new BinaryTree(rootValue);
        fixedBinaryTree.createBinaryTree(rootValue*2, BinaryTree.TreeType.FIXED);

        BinaryTree randomBinaryTree = new BinaryTree(rootValue);
        randomBinaryTree.createBinaryTree(rootValue*100, BinaryTree.TreeType.RANDOM);
        randomBinaryTree.addNode(25);

        search(randomBinaryTree, 25);
        search(fixedBinaryTree, 30);
    }

    private static void search(BinaryTree tree, int searchValue) {
        long start = System.currentTimeMillis();

        //Node node = binaryTree.getRootNode().search(searchValue);
        Node node = Node.search(searchValue, tree.getRootNode());

        System.out.println("Search in " + tree.getType() + " tree took: " + (System.currentTimeMillis() - start) + " (ms)");
        if (node != null) {
            System.out.println("Node: " + node.toString());
        } else {
            System.out.println("Node: null");
        }
        System.out.println("Search steps: " + Node.getCounter() + "\n");
    }
}
