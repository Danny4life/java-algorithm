package ds.leetcode2;

import java.util.*;

public class TreeNode {

    /**
     * This class represents a node in a binary tree.
     * Each node has a value (val) and references to its left and right child nodes.
     * The constructor initializes the node with a value while leaving left and right as null.
     */
    int val; // Stores the value of the node
    TreeNode left; // Reference to the left child node

    TreeNode right; // Reference to the right child node


    TreeNode(int val) {
        this.val = val;
    }
}

class InOrderTransversal{
    // Recursive Inorder Traversal

    public static List<Integer> inorderTraversal(TreeNode root) {
        /**
         * This method initializes an empty list (result) to store the inorder traversal sequence.
         * Calls a recursive helper method (inorderHelper) to traverse the tree.
         * Returns the final list of node values.
         */
        List<Integer> result = new ArrayList<>(); // List to store the inorder traversal result
        inorderHelper(root, result); // Call helper function to perform recursion
        return result; // Return the final inorder traversal list
    }

    private static void inorderHelper(TreeNode node, List<Integer> result) {
        /**
         * Visit the left subtree.
         * Visit the current node and add its value to result.
         * Visit the right subtree.
         * If node == null, it means we reached a leaf’s child, so recursion stops.
         */
        if (node == null) return; // Base case: If node is null, stop recursion

        // Visit left subtree
        inorderHelper(node.left, result);

        // Visit current node
        result.add(node.val);

        // Visit right subtree
        inorderHelper(node.right, result);
    }

    // Iterative Inorder Traversal using Stack
    public static List<Integer> inorderTraversalIterative(TreeNode root) {
        /**
         * This method avoids recursion by using an explicit stack.
         * Uses a Stack<TreeNode> to simulate recursion.
         * The while loop runs until we have unprocessed nodes.
         */
        List<Integer> result = new ArrayList<>(); // Stores traversal result
        Stack<TreeNode> stack = new Stack<>();      // Stack to keep track of nodes
        TreeNode current = root; // Start from the root node

        while (current != null || !stack.isEmpty()) {
            // Reach the leftmost node
            while (current != null) {
                /**
                 * Finds the leftmost node in the current subtree by pushing nodes onto the stack.
                 * Moves left until current becomes null.
                 */
                stack.push(current); // Push current node to stack
                current = current.left; // Move to left child
            }

            /**
             * Processes the node (adds it to the result list).
             * Then moves to its right subtree (if it exists).
             */
            // Process the node
            current = stack.pop(); // Pop from stack (Leftmost node first)
            result.add(current.val); // Add node's value to result list

            // Visit the right subtree
            current = current.right;
        }

        return result;
    }

    // Helper function to build tree for testing
    public static TreeNode buildTree(Integer[] nodes) {
        if (nodes.length == 0 || nodes[0] == null) return null;

        TreeNode root = new TreeNode(nodes[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;

        while (!queue.isEmpty() && i < nodes.length) {
            TreeNode current = queue.poll();

            if (nodes[i] != null) {
                current.left = new TreeNode(nodes[i]);
                queue.add(current.left);
            }
            i++;

            if (i < nodes.length && nodes[i] != null) {
                current.right = new TreeNode(nodes[i]);
                queue.add(current.right);
            }
            i++;
        }

        return root;
    }

    public static void main(String[] args) {
        // Test cases
        Integer[][] testCases = {
                {1, null, 2, 3},
                {1, 2, 3, 4, 5, null, 8, null, null, 6, 7, 9},
                {},
                {1}
        };

        for (Integer[] testCase : testCases) {
            TreeNode root = buildTree(testCase);
            System.out.println("Recursive Inorder: " + inorderTraversal(root));
            System.out.println("Iterative Inorder: " + inorderTraversalIterative(root));
            System.out.println("----------------------");
        }
    }
}
