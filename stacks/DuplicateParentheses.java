import java.util.*;
public class DuplicateParentheses {

    static boolean check(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                int count = 0;
                while (!s.empty() && s.peek() != '(') {
                    s.pop();
                    count++;
                }
                s.pop();
                if (count < 1) {
                    return true;
                }
            }
            else {
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String args[]) {
        String str = "(((a+b)))+(c+d))";
        System.out.println(check(str));
    }
}