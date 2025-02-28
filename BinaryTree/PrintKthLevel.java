import java.util.LinkedList;
import java.util.Queue;

public class PrintKthLevel {

    static void DFSSolution(Node root, int k, int curLevel) {
        if (root == null) return;
        if (k == curLevel) {
            System.out.print(root.data + " ");
            return;
        }
        DFSSolution(root.left, k, curLevel+1);
        DFSSolution(root.right, k, curLevel+1);   
    }

    static void BFSSolution(Node root, int k, int curLevel) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            if (q.peek() == null) {
                curLevel++;
                q.add(null);
                q.remove();
                if (q.peek() == null) {
                    return;
                }
            }
            else {
                if (curLevel == k) {
                   System.out.print(q.peek().data + " ");
                }
                if (q.peek().left != null) {
                    q.add(q.peek().left);
                }
                if (q.peek().right != null) {
                    q.add(q.peek().right);
                }
                q.remove();
            }
        }
    }
    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        

        DFSSolution(root, 2, 1);
    }
}