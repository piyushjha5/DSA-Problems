import java.util.*;
public class BinarySearch {

    public static int binarysearch(int array[], int key) {
        int start = 0;
        int end = array.length-1;
        int mid = array.length/2;
        for(int i = start; i <= end; i++) {
            if (key == array[i]) {
                return i;
            }
            else if (key < array[mid]) {
                end = mid-1;
            }
            else  {
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int array[] = {7, 4, 5, 20, 10};
        int key = 20;
        int index = binarysearch(array, key);
        if(index == -1)
            System.out.println("Element not found");
        else
        System.out.println("Element "+key+" found at index " +index);

    }
}