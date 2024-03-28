import java.util.*;
public class BubbleSort {
    public static void bubbleSort(int array[]) {
        for(int i = 0; i < array.length-1; i++) {
            for(int j = 0; j < array.length-i-1; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
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
        bubbleSort(array);
        System.out.print("Array after sorting : ");
        printarray(array);
    }
}