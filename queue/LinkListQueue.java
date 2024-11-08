public class LinkListQueue {

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head, tail = null;
        
        boolean empty() {
            return head == null && tail == null;
        }
        void add(int data) {
            Node newNode = new Node(data);
            if(head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        int remove() {
            if(empty()) {
                System.out.print("Memory Underflow ");
                return -1;
            }
            int front = head.data;
            if (head == tail) {
                head = tail = null;
                return front;
            }
            head = head.next;
            return front;
        }
        int peek() {
            if(empty()) {
                System.out.print("Memory Underflow ");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[]) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.empty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}