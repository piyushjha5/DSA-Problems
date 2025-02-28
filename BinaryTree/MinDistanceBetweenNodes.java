public class MinDistanceBetweenNodes {

    static int lcaDistance(Node root, int n) {
        if (root == null) return -1;
        if (root.data == n) return 0;

        int leftDistance = lcaDistance(root.left, n);
        int rightDistance = lcaDistance(root.right, n);
        if (leftDistance == -1 && rightDistance == -1) {
            return -1;
        }else if (leftDistance == -1) {
            return rightDistance+1;
        }else {
            return leftDistance+1;
        }

    }
    
    static int minDistance(Node root, int n1, int n2) {
        Node lca = LowestCommonAncester.lca(root, n1, n2);
        int distance1 = lcaDistance(lca, n1);
        int distance2 = lcaDistance(lca, n2);
        return distance1 + distance2;
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

        System.out.println(minDistance(root, 4, 3));        
    }
}