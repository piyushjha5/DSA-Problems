import java.util.*;
public class ReverseAString {

    static String reverse(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder str2 = new StringBuilder("");
        while (s.size() > 0) {
            str2.append(s.pop());
        }
        return str2.toString();
    }
    public static void main(String args[]) {
        String str = "Piyush";
        System.out.println(reverse(str));
        
    }
}