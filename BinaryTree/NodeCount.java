public class NodeCount {

    static int count (Node root) {
        if (root == null) {
            return 0;
        }
        // int count = count(root.left) + count(root.right);
        return count(root.left) + count(root.right) + 1;
    }
    public static void main(String args[]) {
        Node root = new Node(1);
        
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);

        System.out.println(count(root));
    }
}