import java.util.*;

public class LowestCommonAncester {

    // Approach 1
    static boolean getPath(Node root, int n1, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }
        path.add(root);
        if (root.data == n1) {
            return true;
        }
        boolean left = getPath(root.left, n1, path);
        boolean right = getPath(root.right, n1, path);
        if (left || right) {
            return true;
        }
        path.remove(root);
        return false;
    }

    static int findLowestCommonAncestor(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        int i = 0;
        while (i < path1.size() && i < path2.size()) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
            i++;
        }
        int lca = path1.get(i - 1).data;
        return lca;
    }

    // Apprach 2
    static Node lca(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        Node left = lca(root.left, n1, n2);
        Node right = lca(root.right, n1, n2);
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        return root;
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

        System.out.println(findLowestCommonAncestor(root, 7, 6));
        System.out.println(lca(root, 8, 7).data);
    }
}