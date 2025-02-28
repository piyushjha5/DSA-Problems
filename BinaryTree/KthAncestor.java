public class KthAncestor {

    static int findAncestor(Node root, int k, int n) {
        if (root == null) return -1;
        if (root.data == n) return 1;

        int left = findAncestor(root.left, k, n);
        int right = findAncestor(root.right, k, n);

        if (left == -1 && right == -1) return -1;

        if (Math.max(left, right) == k) {
            System.out.println(root.data);
        }
        return Math.max(left, right) + 1;
    }
    public static void main(String args[]) {
        //      1
        //     / \
        //    2   3
        //   / \ / \
        //  4  5 6  7
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        findAncestor(root, 1, 7);
    }
}