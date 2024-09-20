package lab2;

public class AVLTreeTest {
    public static void main(String[] args) {
        
    	// Create a new AVL tree instance
        AVLTree<Integer> tree = new AVLTree<>();

        // Run tests
        runTests(tree);

    }

    // Method to run the 6 tests
    public static void runTests(AVLTree<Integer> tree) {
        
    	// Test 1 - Left Single Rotation: insert 1,2,3
    	System.out.println("Running Test 1: Left Single Rotation - Insert 1, 2, 3");
        runTest(tree, new int[]{1, 2, 3});

        // Test 2 - Right Single Rotation: insert 3,2,1
        System.out.println("Running Test 2: Right Single Rotation - Insert 3, 2, 1");
        tree.clear();  // Reset the tree
        runTest(tree, new int[]{3, 2, 1});

        // Test 3 -  Right-Left Double Rotation: insert 1,3,2
        System.out.println("Running Test 3: Right-Left Double Rotation - Insert 1, 3, 2");
        tree.clear();
        runTest(tree, new int[]{1, 3, 2});

        // Test 4 - Left-Right Double Rotation: insert 3,1,2
        System.out.println("Running Test 4: Left-Right Double Rotation - Insert 3, 1, 2");
        tree.clear();
        runTest(tree, new int[]{3, 1, 2});

        // Test 5 -  Major test I: insert 1,2,3,4,5,6
        System.out.println("Running Test 5: Major Test I - Insert 1, 2, 3, 4, 5, 6");
        tree.clear();
        runTest(tree, new int[]{1, 2, 3, 4, 5, 6});

        // Test 6 - Major test II: insert 63,9,19,27,18,108,99,81
        System.out.println("Running Test 6: Major Test II - Insert 63, 9, 19, 27, 18, 108, 99, 81");
        tree.clear();
        runTest(tree, new int[]{63, 9, 19, 27, 18, 108, 99, 81});

        System.out.println("All tests completed.");
    }

    // Helper method to insert nodes and print after each insertion
    public static void runTest(AVLTree<Integer> tree, int[] nodes) {
        for (int node : nodes) {
            System.out.println("Inserting " + node);
            tree.insert(node);
            System.out.println("Tree after inserting " + node + ":");
            tree.print();
        }
        
        System.out.println("-------------------------------------------------\n");
    }

}
