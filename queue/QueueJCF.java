import java.util.*;
public class QueueJCF {
    public static void main(String args[]) {
        Queue<Integer> q = new LinkedList<>(); 
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        
        System.out.println(q.remove());
        System.out.println(q.peek());
    }
}