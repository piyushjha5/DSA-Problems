public class ArrayQueue {

    static class Queue {
        int arr[];
        int size;
        int rear;
        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }   
        
        boolean empty() {
            return rear == -1;
        }

        void add(int data) {
            if (rear == size-1) {
                System.out.println("Memory overflow");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        int remove() {
            if(empty()) {
                System.out.println("Memory Underflow");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }

        int peek() {
            if(empty()) {
                System.out.println("Memory Underflow");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String args[]) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while (!q.empty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}