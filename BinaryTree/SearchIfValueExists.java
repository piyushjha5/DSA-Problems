public class SearchIfValueExists {
    static boolean Search(Node root, int key) {
        if(root == null) {
            return false;
        }
        if(root.data == key) {
            return true;
        }
        return Search(root.left, key) || Search(root.right, key);
    }
    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println(Search(root, 8));
    }
}