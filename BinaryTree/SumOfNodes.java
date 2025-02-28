public class SumOfNodes {

    static int sum (Node root) {
        if (root == null) {
            return 0;
        }
        int totalSum = root.data + sum(root.left) + sum(root.right);
        return totalSum;
    }
    public static void main(String args[]) {

        Node root = new Node(1);
        
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);

        System.out.println(sum(root));
    }
}