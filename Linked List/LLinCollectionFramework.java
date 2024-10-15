import java.util.LinkedList;
public class LLinCollectionFramework {
    public static void main(String args[]) {

        // Create
        LinkedList<Integer> ll = new LinkedList<>();
        
        // Add
        ll.addFirst(0);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);

        // Print
        System.out.println(ll);

        // Remove
        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);
    }
}