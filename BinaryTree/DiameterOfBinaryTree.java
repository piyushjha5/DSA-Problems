// Diameter of Binary Tree 
// Given the root of a binary tree, return the length of the diameter of the tree. 
// The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root. 
// The length of a path between two nodes is represented by the number of edges between them. 
// Example 1: 
// Input: root = [1,2,3,4,5] 
// Output: 3 
// Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3]. 
// Example 2: 
// Input: root = [1,2] 
// Output: 1 

// Constraints: 
// The number of nodes in the tree is in the range [1, 104]. 
// -100 <= Node.val <= 100


public class DiameterOfBinaryTree {

    static int diameter = 0;

    static int findDiameter(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = findDiameter(root.left);
        int rightHeight = findDiameter(root.right);
        diameter = Math.max(diameter, leftHeight+rightHeight);
        return 1 + Math.max(leftHeight, rightHeight);
    }
    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        // root.left.left.left = new Node(8);
        findDiameter(root);
        System.out.println(diameter);
    }
}