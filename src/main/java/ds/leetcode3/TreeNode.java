package ds.leetcode3;

public class TreeNode {
    int val;

    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

class BinarySearchTree{
    TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int val) {
        root = insertRec(root, val);
    }

    private TreeNode insertRec(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insertRec(root.left, val);
        } else if (val > root.val) {
            root.right = insertRec(root.right, val);
        }
        return root;
    }

    // 🔹 Search and return subtree rooted at the node with value val
    public TreeNode searchBST(int val) {
        return searchBSTRec(root, val);
    }

    // this is the solution to the algorithm
    private TreeNode searchBSTRec(TreeNode root, int val) {
        // copy from here and paste of leetcode to solve the algorithm
        if (root == null || root.val == val) {
            return root; // Found or not found (null)
        }
        //return (val < root.val) ? searchBST(root.left, val) : searchBST(root.right, val);
        return (val < root.val) ? searchBSTRec(root.left, val) : searchBSTRec(root.right, val);
    }

    // 🔹 // Preorder Traversal (Root -> Left -> Right)
    public void preOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " "); // Print root first
            preOrder(root.left); // Then left subtree

            preOrder(root.right);// Then right subtree

        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(4);
        bst.insert(2);
        bst.insert(7);
        bst.insert(1);
        bst.insert(3);

        int searchVal1 = 2;
        TreeNode result1 = bst.searchBST(searchVal1);
        System.out.print("Subtree rooted at " + searchVal1 + ": ");
        bst.preOrder(result1); // Expected Output: 2 1 3
        System.out.println();

        int searchVal2 = 5;
        TreeNode result2 = bst.searchBST(searchVal2);
        System.out.print("Subtree rooted at " + searchVal2 + ": ");
        bst.preOrder(result2); // Expected Output: (empty)
        System.out.println();
    }


}
