import java.util.*;
public class ArrayPairs {

    public static void pair(int array[]) {
        for(int i = 0; i < array.length; i++) {
            for(int j = i+1; j < array.length; j++) {
                System.out.print("(" +array[i]+", "+array[j]+"), ");
            }
        }
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int array[] = {1, 2, 3, 4, 5};
        pair(array);
    }
}