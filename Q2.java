// Reverse an array

import java.util.*;

public class Q2 {

    public static void ArrayReverse(int arry[], int size) {
        int rarry[] = new int[size];
        int rsize = size;
        for (int i = 0; i < size; i++) {
            rarry[rsize - 1] = arry[i];
            rsize = rsize - 1;
        }
        System.out.println("Array is : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arry[i] + " ");
        }
        System.out.println();
        System.out.println("Reversed Array is : ");
        for (int i = 0; i < size; i++) {
            System.out.print(rarry[i] + " ");
        }
        return;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = input.nextInt();
        int arry[] = new int[size];
        System.out.println("Enter elements of array : ");
        for (int i = 0; i < size; i++) {
            arry[i] = input.nextInt();
        }
        ArrayReverse(arry, size);
    }
}