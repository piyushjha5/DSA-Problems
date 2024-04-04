import java.util.*;
public class CountingSort {

    public static void Sort(int array[]) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++) {
            largest = Math.max(largest, array[i]);
        }
        int count[] = new int[largest+1];
        for(int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }
        int j = 0;
        for(int i = 0; i < count.length; i++) {
            while(count[i] > 0) {
                array[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printarray(int array[]) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int array[] = {6, 7, 3, 4, 1};
        System.out.print("Array before sorting : ");
        printarray(array);
        Sort(array);
        System.out.print("Array after sorting : ");
        printarray(array);
    }
}