public class DoublyLL {

    public class Node {
        int data;
        Node next;
        Node prev;
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void printList() {
        Node temp = head;
        if(temp == null) {
            System.out.println("Empty list, nothing to print");
            return;
        }
        while (temp != null) {
            System.out.println(temp.data+"<->");
            temp = temp.next;
        }
    }

    public void removeFirst() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        if(head == tail) {
            head = tail = null;
        }
        else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public void removeLast() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        if(head == tail) {
            head = tail = null;
        }
        else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    public static void main(String args[]) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(1);
        dll.addLast(2);
        dll.printList();
        dll.removeLast();
        dll.printList();
    }
}