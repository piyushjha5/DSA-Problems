public class SubTreeOfAnotherTree {

    static boolean checkIdentical(Node root, Node subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root == null || subRoot == null) {
            return false;
        }
        if (root.data != subRoot.data) {
            return false;
        }
        return checkIdentical(root.left, subRoot.left) && checkIdentical(root.right, subRoot.right);
    }

    static boolean isItSubTree(Node root, Node subRoot) {
        if (root == null) {
            return false;
        }
        if (root.data == subRoot.data) {
            return checkIdentical(root, subRoot);
        }
        return isItSubTree(root.left, subRoot) || isItSubTree(root.right, subRoot);
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);
        

        System.out.println(isItSubTree(root, subRoot));
        
    }
}