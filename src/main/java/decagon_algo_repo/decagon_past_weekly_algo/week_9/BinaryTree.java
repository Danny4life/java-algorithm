package decagon_algo_repo.decagon_past_weekly_algo.week_9;

//Task
//        Given the following class:
//
//class TreeNode {
//    public int val;
//    public TreeNode left;
//    public TreeNode right;
//}
//    complete the function
//
//        boolean BinaryTree.compare(TreeNode a, TreeNode b);
//        which compares the two trees defined by TreeNodes a and b and
//        returns true if they are equal in structure and in value and false otherwise.
//
//        Examples
//        Two perfect binary trees with three nodes labeled 1 2 3 are shown to be equal⟹ true
//
//        Two perfect binary trees with 3 nodes are shown to be nonequal.
//        The left tree has nodes labeled 1, 2 and 3 and the right tree has nodes labeled 1, 3 and 3⟹ false (values are not the same: 2 != 3)
//
//        Two binary trees, each with 3 nodes labeled 1, 2 and 3.
//        The left tree is perfect while the right tree is a linked list of left children,
//        1-2-3 from the root to the single leaf.
//

        // test
//        import org.junit.jupiter.api.DisplayName;
//        import org.junit.jupiter.api.Test;
//        import static org.junit.jupiter.api.Assertions.assertTrue;
//        import static org.junit.jupiter.api.Assertions.assertFalse;
//
//
//@DisplayName("Binary Tree Compare")
//class BinaryTreeCompareTest {
//
//    @Test
//    @DisplayName("should return true for equal TreeNodes")
//    public void itShouldReturnTrueForEqualTreeNodes() {
//        final var a = new TreeNode(1, null, null);
//        final var b = new TreeNode(1, null, null);
//        Visualizer.renderTree(a, "a");
//        Visualizer.renderTree(b, "b");
//        assertTrue(BinaryTree.compare(a, b));
//    }
//
//    @Test
//    @DisplayName("should return false for non-equal TreeNodes")
//    public void itShouldReturnFalseForNonEqualTreeNodes() {
//        final var a = new TreeNode(1, null, null);
//        final var c = new TreeNode(2, null, null);
//        Visualizer.renderTree(a, "a");
//        Visualizer.renderTree(c, "c");
//        assertFalse(BinaryTree.compare(a, c));
//    }
//}



class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    public static void main(String[] args) {
        // Test cases for true
        TreeNode a = new TreeNode(1, null, null);
        TreeNode b = new TreeNode(1, null, null);


        // test cases for false
//        TreeNode a = new TreeNode(1, null, null);
//        TreeNode b = new TreeNode(2, null, null);


        // Test cases printout for true
        System.out.println("Expecting true for equal TreeNodes (a, b): " + BinaryTree.compare(a, b));

        // Test cases printout for false
        //System.out.println("Expecting false for non-equal TreeNodes (a, b): " + BinaryTree.compare(a, b));

    }

    public static boolean compare(TreeNode a, TreeNode b) {
        if (a != null && b != null) {
            return a.val == b.val &&
                    BinaryTree.compare(a.left, b.left) &&
                    BinaryTree.compare(a.right, b.right);
        }

        return a == b;
    }
}


