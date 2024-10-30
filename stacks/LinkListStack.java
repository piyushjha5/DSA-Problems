class LinkListStack {

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head = null;

        boolean isEmpty() {
            return head == null;
        }
        
        void push(int data) {
            Node newNode = new Node(data);
            if(isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        int pop() {
            if(isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        int peek() {
            if(isEmpty()) {
                return -1;
            }
            return head.data;
        }

        void printLinkList() {
            if (isEmpty()) {
                System.out.println("stack is empty");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.println(temp);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.printLinkList();
        System.out.println(s.peek()+" is the top element");
        System.out.println(s.pop()+" is removed from stack");
        s.printLinkList();
        System.out.println(s.isEmpty());
    }
}