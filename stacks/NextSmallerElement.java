import java.util.*;
public class NextSmallerElement {

    static void find_NSE(int arr[], int NSE[]) {
        Stack<Integer> s = new Stack<>();
        for(int i = arr.length-1; i >= 0; i--) {
            while (!s.empty() && arr[i] <= arr[s.peek()]) {
                s.pop();
            }
            if(s.empty()) {
                NSE[i] = -1;
            }
            else {
                NSE[i] = arr[s.peek()];
            }
            s.push(i);
        }
    }
    public static void main(String args[]) {
        int arr[] = {2, 1, 5, 6, 2, 3};
        int NSE[] = new int[arr.length];
        find_NSE(arr, NSE);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(NSE[i]+" ");
        }
    }
}