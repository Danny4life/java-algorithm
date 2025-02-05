package ds.bt;

// https://www.codewars.com/kata/63f13a354a828b0041979359/train/java

/**
 * We are storing numbers in the nodes of a binary tree. The tree starts at the root node.
 * The root has two child nodes, its leftchild and rightchild.
 * Each of those nodes also has two child nodes, and so on,
 * until we reach the leaf nodes, nodes that have no children.
 * Each node stores one nonnegative integer.
 * The value at every non-leaf node is supposed to be the sum of its two children.
 * But the value at one node is incorrect. Find this node.
 *
 * Example: Consider the tree below. Note that 13 is the sum of 6 and 7,
 * but the value 15 is incorrect, because 15 != 5 + 9 and 27 != 13 + 15.
 * Clearly the 15 should be changed to 14.
 *
 *            27
 *          /    \
 *         13    15
 *        /  \   / \
 *       6   7  5   9
 * The tree will always be full (all non-leaf nodes have exactly 2 children)
 * and perfect (all leaves are on the bottom level).
 * If we consider the root as level 1, its children as level 2,
 * their children as level 3, and so on,
 * the tree will contain at least 3 levels (and no more than 10).
 * If the incorrect value occurs on the leaf level,
 * then the right child will always be the incorrect one.
 *
 * The tree is provided as a list or array (as appropriate to the language),
 * with the nodes in breath-first order. So:
 * The root is element 0, its leftchild is element 1 and its rightchild is element 2;
 * Element 1's leftchild is element 3 and its rightchild is element 4;
 * Element 2's leftchild is element 5 and its rightchild is element 6, and so on.
 *
 * Your function should return the index of the incorrect node and the value that it should be changed to.
 * In a language that doesn't allow multiple values to be returned,
 * the Solution Setup shows what type to return (e.g. in Java an array of two integers,
 * in C# a tuple of two integers).
 *
 * Examples:
 *
 * If the tree is [27, 13, 15, 6, 7, 5, 9], the function should return 2,14.
 *
 * If the tree is [21, 9, 10, 4, 5, 4, 6, 2, 2, 1, 4, 1, 3, 2, 4], the function should return 0,19.
 *
 * If the tree is [29, 13, 16, 5, 8, 9, 1], the function should return 6,7.
 * This is because of the condition "if the incorrect value occurs on the leaf level,
 * then the right child will always be the incorrect one." Since 9 + 1 != 16, the 1 must be changed to 7, rather than changing the 9 to 15.
 */


import java.util.Arrays;

/**
 * import org.junit.jupiter.api.Test;
 * import static org.junit.jupiter.api.Assertions.assertArrayEquals;
 *
 * class SampleTests {
 *     @Test
 *     void testTreeWith3Levels() {
 *
 *         assertArrayEquals(new int[] {0, 27},
 *                           BinaryTreeWithIncorrectValue.findIncorrectNumber(new int[] {28, 13, 14, 6, 7, 5, 9}));
 *
 *         assertArrayEquals(new int[] {1, 13},
 *                           BinaryTreeWithIncorrectValue.findIncorrectNumber(new int[] {27, 14, 14, 6, 7, 5, 9}));
 *
 *         assertArrayEquals(new int[] {2, 14},
 *                           BinaryTreeWithIncorrectValue.findIncorrectNumber(new int[] {27, 13, 15, 6, 7, 5, 9}));
 *
 *         assertArrayEquals(new int[] {6, 7},
 *                           BinaryTreeWithIncorrectValue.findIncorrectNumber(new int[] {29, 13, 16, 5, 8, 9, 1}));
 *     }
 *
 *     @Test
 *     void testTreeWith4Levels() {
 *
 *         assertArrayEquals(new int[] {0, 19},
 *                           BinaryTreeWithIncorrectValue.findIncorrectNumber(new int[] {21, 9, 10, 4, 5, 4, 6, 2, 2, 1, 4, 1, 3, 2, 4}));
 *
 *         assertArrayEquals(new int[] {2, 10},
 *                           BinaryTreeWithIncorrectValue.findIncorrectNumber(new int[] {19, 9, 12, 4, 5, 4, 6, 2, 2, 1, 4, 1, 3, 2, 4}));
 *
 *         assertArrayEquals(new int[] {3, 4},
 *                           BinaryTreeWithIncorrectValue.findIncorrectNumber(new int[] {19, 9, 10, 5, 5, 4, 6, 2, 2, 1, 4, 1, 3, 2, 4}));
 *
 *         assertArrayEquals(new int[] {8, 1},
 *                           BinaryTreeWithIncorrectValue.findIncorrectNumber(new int[] {19, 9, 10, 4, 5, 4, 6, 3, 2, 1, 4, 1, 3, 2, 4}));
 *
 *
 *     }
 * }
 */

public class BinaryTreeWithIncorrectValue {
    public static int[] findIncorrectNumber(int[] tree){
        // Iterate through the tree in reverse order
        for(int i = tree.length - 1; i > 0; i -= 2){
            int parentIndex = (i - 1) / 2;
            int leftNode = tree[i - 1];
            int rightNode = tree[i];
            int parentNode = tree[parentIndex];

            // Check if the sum of the left and right nodes is equal to the parent node
            if (leftNode + rightNode != parentNode){

                // Determine if the parent or child is incorrect
                int siblingIndex = (parentIndex % 2 == 0) ? parentIndex - 1 : parentIndex + 1;
                Integer grandParentIndex = (parentIndex > 0) ? (parentIndex - 1) / 2 : null;

                // Ensure siblingIndex is within bounds
                if(siblingIndex < tree.length && siblingIndex >= 0){
                    int siblingNode = tree[siblingIndex];

                    // Check if parent's generation sums correctly
                    if(grandParentIndex != null && grandParentIndex < tree.length) {
                        int grandParentNode = tree[grandParentIndex];

                        if(parentNode + siblingNode == grandParentNode){
                            // Correct at the child level
                            int correctValue = parentNode - leftNode;
                            // Correct the right child
                            return new int[]{i, correctValue};
                        }else {
                            // Correct the parent level
                            int correctValue = leftNode + rightNode;
                            return new int[]{parentIndex, correctValue};
                        }
                    }
                }
                // Correct the parent directly
                int correctValue = leftNode + rightNode;
                return new int[]{parentIndex, correctValue};
            }

        }

        return null;

    }

    public static void main(String[] args) {
        // Run all test cases - test the case one after the other
        runTest("testTreeWith3Levels - Case 1", new int[] {28, 13, 14, 6, 7, 5, 9}, new int[] {0, 27});
        runTest("testTreeWith3Levels - Case 2", new int[] {27, 14, 14, 6, 7, 5, 9}, new int[] {1, 13});
        runTest("testTreeWith3Levels - Case 3", new int[] {27, 13, 15, 6, 7, 5, 9}, new int[] {2, 14});
        runTest("testTreeWith3Levels - Case 4", new int[] {29, 13, 16, 5, 8, 9, 1}, new int[] {6, 7});

        runTest("testTreeWith4Levels - Case 1", new int[] {21, 9, 10, 4, 5, 4, 6, 2, 2, 1, 4, 1, 3, 2, 4}, new int[] {0, 19});
        runTest("testTreeWith4Levels - Case 2", new int[] {19, 9, 12, 4, 5, 4, 6, 2, 2, 1, 4, 1, 3, 2, 4}, new int[] {2, 10});
        runTest("testTreeWith4Levels - Case 3", new int[] {19, 9, 10, 5, 5, 4, 6, 2, 2, 1, 4, 1, 3, 2, 4}, new int[] {3, 4});
        runTest("testTreeWith4Levels - Case 4", new int[] {19, 9, 10, 4, 5, 4, 6, 3, 2, 1, 4, 1, 3, 2, 4}, new int[] {8, 1});
    }

    private static void runTest(String testName, int[] tree, int[] expected) {
        int[] result = findIncorrectNumber(tree);
        if (Arrays.equals(result, expected)) {
            System.out.println(testName + " - ✅ Passed");
        } else {
            System.out.println(testName + " - ❌ Failed. Expected " + Arrays.toString(expected) + " but got " + Arrays.toString(result));
        }
    }
}
