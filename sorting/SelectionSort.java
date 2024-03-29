import java.util.*;
public class SelectionSort {
    public static void Sort(int array[]) {
        for(int i = 0; i < array.length-1; i++) {
            int minIndex = i;
            for(int j = i+1; j < array.length; j++) {
                if(array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
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