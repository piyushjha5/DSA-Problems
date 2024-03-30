import java.util.*;
public class InsertionSort {
    public static void Sort(int array[]) {
        for(int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i-1;
            for(j = i-1; j >= 0; j--) {
                if(array[j] > temp) {
                    array[j+1] = array[j];
                }
                else {
                    break;
                }
            }
            array[j+1] = temp;
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