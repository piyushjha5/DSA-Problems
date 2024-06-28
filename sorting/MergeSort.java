import java.util.*;
public class MergeSort {

    public static void printArray(int array[]) {
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void mergeSort(int array[], int si, int ei) {
        if(si >= ei) {
            return;
        }
        int mi = si+(ei-si) / 2;
        mergeSort(array, si, mi);
        mergeSort(array, mi+1, ei);
        merge(array, si, mi, ei);
    }


    //  Merging the sorted parts
    public static void merge(int array[], int si, int mi, int ei) {
        int temp[] = new int[ei-si+1];
        int i = si;  //Index for 1st sorted part
        int j = mi+1;  //Index for 2nd sorted part
        int k = 0;  //Index of temporary array

        while(i <= mi && j <= ei) {
            if(array[i] < array[j]) {
                temp[k] = array[i];
                i++;
            }
            else{
                temp[k] = array[j];
                j++;
            }
            k++;
        }

        //  Adding remaining elements of first part
        while(i <= mi) {
            temp[k] = array[i];
            k++; i++;
        }

        //  Adding remaining elements of second part
        while(j <= ei) {
            temp[k] = array[j];
            k++; j++;
        }

        //  Copy temp array to oringinal array
        for(k = 0, i = si; k < temp.length; k++, i++) {
            array[i] = temp[k];
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int array[] = {3, 6, 3, 9, 5, 2, 8};
        mergeSort(array, 0, array.length-1);
        printArray(array);
    }
}