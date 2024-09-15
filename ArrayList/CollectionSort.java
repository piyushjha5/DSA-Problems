import java.util.*;
public class CollectionSort {
    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(8);
        list.add(4);
        list.add(5);

        System.out.println(list);

        System.out.println("Ascending Order Sort");
        Collections.sort(list);
        System.out.println(list);

        System.out.println("Descending Order Sort Using Comparator Function ");
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}