//Write a function to find last occurance of an element in array
import java.util.*;
public class LastOccurance {
    public static int checkOccurance(int arr[], int key, int i) {
        if(i == arr.length)
            return -1;
        int isFound = checkOccurance(arr, key, i+1);
        if(isFound != -1)
            return isFound;
        if(arr[i] == key)
            return i;

        return isFound;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5, 4, 3};
        int key = 3;
        System.out.println(checkOccurance(arr, key, 0));
    }
}