import java.util.*;
public class QuickSort {
    public static void quickSort(int array[], int si, int ei) {
        if(si >= ei)
            return;
        int pivotIndex = partition(array, si, ei);
        quickSort(array, si, pivotIndex-1); //Left
        quickSort(array, pivotIndex+1, ei); //Right
    }

    public static int partition(int array[], int si, int ei) {
        int pivot = array[ei];
        int i = si-1;
        for(int j = si; j < ei; j++) {
            if(array[j] <= pivot) {
                i++;
                //swap
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        i++;
        //swap
        int temp = pivot;
        array[ei] = array[i];
        array[i] = temp;

        return i;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int array[] = {3, 6, 3, 9, 5, 2, 8};
        quickSort(array, 0, array.length-1);
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}