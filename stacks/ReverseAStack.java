import java.util.*;

public class ReverseAStack {
    
    static void stackReverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        stackReverse(s);
        pushAtBottom(s, top);
    }

    static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("Original Stack: " + s);
        stackReverse(s);
        System.out.println("Reversed Stack: " + s);
    }
}
