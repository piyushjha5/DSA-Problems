public class IsIdentical {

    static boolean identical(Node root, Node subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root != null && subRoot != null && root.data == subRoot.data) {
            return identical(root.left, subRoot.left) && identical(root.right, subRoot.right);
        }
        return false;
    }
    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        
        Node subRoot = new Node(1);
        subRoot.left = new Node(2);
        subRoot.right = new Node(3);

        System.out.println(identical(root, subRoot));
    }
}