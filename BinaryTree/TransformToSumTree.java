public class TransformToSumTree {

    static int sumTree(Node root) {
        if (root == null) return 0;

        int left = sumTree(root.left);
        int right = sumTree(root.right);
        
        int currData = root.data;

        int leftData = root.left == null ? 0 : root.left.data;
        int rightData = root.right == null ? 0 : root.right.data;
        root.data = left + leftData + right + rightData;
        return currData;
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
        
        sumTree(root);
        System.out.println(sumTree(root));
    }
}