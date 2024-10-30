import java.util.*;
public class PreviousSmallerElement {

    static void find_PSE(int arr[], int PSE[]) {
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < arr.length; i++) {
            while (!s.empty() && arr[i] <= arr[s.peek()]) {
                s.pop();
            }
            if(s.empty()) {
                PSE[i] = -1;
            }
            else {
                PSE[i] = arr[s.peek()];
            }
            s.push(i);
        }
    }
    public static void main(String args[]) {
        int arr[] = {2, 1, 5, 6, 2, 3};
        int PSE[] = new int[arr.length];
        find_PSE(arr, PSE);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(PSE[i]+" ");
        }
    }
}