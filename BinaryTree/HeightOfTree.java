public class HeightOfTree {

    static int heightOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = 1 + heightOfTree(root.left);
        int rightHeight = 1 + heightOfTree(root.right);

        return Math.max(leftHeight, rightHeight);
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.left.left = new Node(8);

        System.out.println(heightOfTree(root));
    }
}
