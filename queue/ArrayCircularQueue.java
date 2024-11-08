public class ArrayCircularQueue {
    // Static inner class representing the Queue structure
    static class Queue {
        int arr[];  // Array to store queue elements
        int size;   // Maximum size of the queue
        int rear;   // Index of the rear element
        int front;  // Index of the front element

        // Constructor to initialize the queue
        Queue(int n) {
            arr = new int[n];  // Initialize array with given size
            size = n;          // Set the maximum size
            front = rear = -1; // Start with empty queue
        }   

        // Check if the queue is empty
        boolean empty() {
            return rear == -1 && front == -1;
        }

        // Check if the queue is full
        boolean isFull() {
            // Queue is full if moving rear forward by one reaches front
            return (rear + 1) % size == front;
        }

        // Add an element to the rear of the queue
        void add(int data) {
            // If the queue is full, print error message and exit
            if (isFull()) {
                System.out.println("Memory overflow");
                return;
            }
            // If adding the first element, set front to 0
            if (front == -1) {
                front = 0;
            }
            // Move rear forward in a circular manner
            rear = (rear + 1) % size;
            arr[rear] = data;  // Add the data at the rear position
        }

        // Remove an element from the front of the queue
        int remove() {
            // If the queue is empty, print error message and return -1
            if (empty()) {
                System.out.println("Memory Underflow");
                return -1;
            }
            int result = arr[front];  // Store front element to return it

            // If there was only one element, reset the queue to empty
            if (rear == front) {
                rear = front = -1;
            } else {
                // Move front forward in a circular manner
                front = (front + 1) % size;
            }
            return result;  // Return the removed element
        }

        // Peek at the front element without removing it
        int peak() {
            // If the queue is empty, print error message and return -1
            if (empty()) {
                System.out.println("Memory Underflow");
                return -1;
            }
            return arr[front];  // Return the front element
        }
    }

    // Main method to test the circular queue implementation
    public static void main(String args[]) {
        Queue q = new Queue(5);  // Create a queue of size 5

        // Add elements to the queue
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        // Remove and print elements from the queue until it is empty
        while (!q.empty()) {
            System.out.println(q.remove());
        }

        // Try to peek at the front element when the queue is empty
        System.out.println("Peek Element is " + q.peak());
    }
}