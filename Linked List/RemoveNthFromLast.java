public class RemoveNthFromLast {

    public static class Node {
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

    public void remove(int N) {
        int size = 0;
        Node temp = head;
        while(temp != null) {
            size++;
            temp = temp.next;
        }

        if(size == N) {
            head = head.next;
            return;
        }

        Node prev = head;
        int index = size - N;
        for(int i = 0; i < index-1 /*We have to stop before reaching the Node*/; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return;
    }

    public static void main(String args[]) {
        
        RemoveNthFromLast ll = new RemoveNthFromLast();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.printList();
        System.out.println(size);
        ll.remove(3);
        ll.printList();
    }
}