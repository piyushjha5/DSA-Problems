public class MergeSort {

    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }   
    }

    public static Node head;

    public static void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node findMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node mergeBreak(Node head) {
        if(head == null || head.next == null) {
            return head;
        }

        // find mid node
        Node midNode = findMid(head);

        // divide the ll in two ll
        Node rightHead = midNode.next;
        midNode.next = null;

        // divide again and store it
        Node newLeft = mergeBreak(head);
        Node newRight = mergeBreak(rightHead);

        // merge the divided/sorted ll
        return merge(newLeft, newRight);
    }

    public static Node merge(Node head1, Node head2) {
        // Node mergedLL = new Node(-1);
        // Node temp = mergedLL;
        // while (head1 != null && head2 != null) {
        //     if(head1.data <= head2.data) {
        //         temp.next = head1;
        //         head1 = head1.next;
        //         temp = temp.next;
        //     }
        //     else {
        //         temp.next = head2;
        //         head2 = head2.next;
        //         temp = temp.next;
        //     }
        // }
        // while (head1 != null) {
        //     temp.next = head1;
        //     head1 = head1.next;
        //     temp = temp.next;
        // }
        // while (head2 != null) {
        //     temp.next = head2;
        //     head2 = head2.next;
        //     temp = temp.next;
        // }
        // return mergedLL.next;
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }

        Node result;
        if(head1.data <= head2.data) {
            result = head1;
            result.next = merge(head1.next, head2);
        }
        else {
            result = head2;
            result.next = merge(head1, head2.next);
        }
        return result;
    }
    public static void main(String args[]) {
        head = new Node(5);
        head.next = new Node(3);
        head.next.next = new Node(1);
        head.next.next.next = new Node(9);
        printList();
        head = mergeBreak(head);
        printList();
    }
}