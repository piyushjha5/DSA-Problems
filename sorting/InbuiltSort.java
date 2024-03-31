import java.util.*;
public class InbuiltSort {

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
        Arrays.sort(array);
        System.out.print("Array after sorting : ");
        printarray(array);

        // Printing an subarray with starting and ending index
        // Arrays.sort(array_Name, Starting Index, Ending Index)
        Arrays.sort(array, 2 , 5);
        System.out.print("Array after sorting (subarray with starting and ending index): ");
        printarray(array);

        // Sorting in descending order
        // Arrays.sort(array_Name, Collections.reverseOrder()) and it only works for objects(In this case our array type is int which is a primitive data type)
        // Arrays.sort(array, Collections.reverseOrder);
        // System.out.print("Sorted array in descending order: ");
        // printarray(array);
    }
}