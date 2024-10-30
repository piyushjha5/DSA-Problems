import java.util.Stack;
public class PushAtBottom {

    static void pushAtEnd(Stack<Integer> s, int data) {
        if(s.size() == 0) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtEnd(s, data);
        s.push(top);
    }
    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s);
        pushAtEnd(s, 0);
        System.out.println(s);
    }
}