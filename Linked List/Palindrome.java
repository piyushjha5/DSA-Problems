public class Palindrome {

    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public Node findMidNode(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome() {

        // If LL is empty or it has only 1 element it is automatically a palindrome
        if(head == null || head.next == null) {
            return true;
        }

        // Getting mid Node using slow fast method 1->2->1->null(2 is the output)
        Node midNode = findMidNode(head);

        // Reversing the 2nd half of LL (from the mid node)
        Node prev = null;
        Node curr = midNode;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Comparing left and right of LL (1)
        Node left = head;
        Node right = prev;
        while (right != null) {
            if(left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String args[]) {
        Palindrome ll = new Palindrome();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(1);
        
        System.out.println(ll.checkPalindrome());
    }
}