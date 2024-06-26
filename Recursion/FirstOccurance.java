//Write a function to find first occurance of an element in array
import java.util.*;
public class FirstOccurance {
    public static int findelement(int arr[], int key, int i) {
        if(i == arr.length)
            return -1;
        if(arr[i] == key)
            return i;
        return findelement(arr, key, i+1);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {21, 1, 1, 14};
        int key = 14;
        System.out.print(findelement(arr, key, 0));
    }
}