import java.util.*;
public class LinearSearch {

    public static int Search(int array[], int key) {
        for(int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int array[] = {7, 4, 5, 20};
        int key = 5;
        int index = Search(array, key);
        if(index == -1)
            System.out.println("Element not found");
        else
        System.out.println("Element "+key+" found at index " +index);
    }
}