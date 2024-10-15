public class LinkedList {

    public class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
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
        tail = newNode;
    }

    public void printList() {
        if(head == null) {
            System.out.println("Node is empty.");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void addMiddle(int data, int index) {
        Node newNode = new Node(data);

        if(head == null) {
            head = tail = newNode;
            return;
        }
        if(index == 0) {
            addFirst(data);
            return;
        }
        Node temp = head;
        for(int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
        size++;
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void removeFirst() {
        if(head == null) {
            System.out.println("Nothing to remove, List is already empty...");
            return;
        }
        else if(size == 1) {
            head = tail = null;
            size--;
            return;
        }
        head = head.next;
        size--;
    }

    public void removeLast() {
        if(head == null) {
            System.out.println("Nothing to remove, List is already empty...");
            return;
        }
        else if(size == 1) {
            head = tail = null;
            size--;
            return;
        }
        Node temp = head;
        for(int i = 0; i < (size-2); i++) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }

    public int iterativeSearch(int key) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if(temp.data == key) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public int recursiveSearch(int key, Node head) {
        if(head == null) {
            return -1;
        }
        if(head.data == key) {
            return 0;
        }
        int index = recursiveSearch(key, head.next);
        if(index == -1) {
            return -1;
        }
        return index+1;
    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.printList();
        System.out.println(ll.recursiveSearch(5, head));
        System.out.println(size);
    }
}