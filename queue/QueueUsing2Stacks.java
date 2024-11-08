import java.util.*;
public class QueueUsing2Stacks {
    // static class Queue { // add O(n), remove O(1) and peek O(1)
    //     Stack<Integer> s1 = new Stack<>();
    //     Stack<Integer> s2 = new Stack<>();

    //     boolean isEmpty() {
    //         return s1.empty();
    //     }

    //     void add(int data) {
    //         while (!s1.empty()) {
    //             s2.push(s1.pop());
    //         }
    //         s1.push(data);
    //         while (!s2.empty()) {
    //             s1.push(s2.pop());
    //         }
    //     }

    //     int remove() {
    //         if (s1.empty()) {
    //             System.out.println("Memory Underflow");
    //             return -1;
    //         }
    //         return s1.pop();
    //     }

    //     int peek() {
    //         if (s1.empty()) {
    //             System.out.println("Memory Underflow");
    //             return -1;
    //         }
    //         return s1.peek();
    //     }
    // }

    static class Queue { // add O(1), remove O(n) and peek O(n)
            Stack<Integer> s1 = new Stack<>();
            Stack<Integer> s2 = new Stack<>();
    
            boolean isEmpty() {
                return s1.empty();
            }
    
            void add(int data) {
                s1.push(data);
            }
    
            int remove() {
                if (s1.empty()) {
                    System.out.println("Memory Underflow");
                    return -1;
                }
                while (!s1.empty()) {
                    s2.push(s1.pop());
                }
                int data = s2.pop();
                while (!s2.empty()) {
                    s1.push(s2.pop());
                }
                return data;
            }
    
            int peek() {
                if (s1.empty()) {
                    System.out.println("Memory Underflow");
                    return -1;
                }
                while (!s1.empty()) {
                    s2.push(s1.pop());
                }
                int data = s2.peek();
                while (!s2.empty()) {
                    s1.push(s2.pop());
                }
                return data;
            }
        }
    public static void main(String args[]) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        System.out.println(q.peek());
    }
}