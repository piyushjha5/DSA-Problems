import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    static class btree {
        static int index = -1;

        public Node buildTree(int nodes[]) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        void preOrder(Node root) {
            if (root == null) {
                System.out.print("-1 ");
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        void inOrder(Node root) {
            if (root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        void postOrder(Node root) {
            if (root == null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        void levelOrder(Node root) {
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node currNode = q.peek();
                if (q.peek() == null) {
                    System.out.println();
                    q.remove();
                    if (q.peek() == null) {
                        return;
                    }
                    q.add(null);
                } else {
                    System.out.print(currNode.data + " ");
                    q.remove();
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }
    }

    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, 8, -1, -1, -1}; // PreOrder Sequence
        btree tree = new btree();
        Node root = tree.buildTree(nodes);

        System.out.print("PreOrder Traversal : ");
        tree.preOrder(root);
        System.out.println();

        System.out.print("InOrder Traversal : ");
        tree.inOrder(root);
        System.out.println();

        System.out.print("PostOrder Traversal : ");
        tree.postOrder(root);
        System.out.println();

        System.out.println("LevelOrder Traversal : ");
        tree.levelOrder(root);
        System.out.println();
    }
}
