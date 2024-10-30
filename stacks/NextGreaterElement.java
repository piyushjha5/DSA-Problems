import java.util.*;
public class NextGreaterElement {

    static void find_NGE(int arr[], int NGE[]) {
        Stack<Integer> s = new Stack<>();
        for(int i = arr.length-1; i >= 0; i--) {
            while(!s.isEmpty() && arr[i] >= arr[s.peek()]) {
                s.pop();
            }
            if(s.isEmpty()) {
                NGE[i] = -1;
            }
            else {
                NGE[i] = arr[s.peek()];
            }
            s.push(i);
        }

        // For circular array, we have to traverse array twice
        // for(int i = (arr.length*2)-1; i >= 0; i--) {
        //     while(!s.isEmpty() && arr[i%arr.length] >= arr[s.peek()]) {
        //         s.pop();
        //     }
        //     if(s.isEmpty()) {
        //         NGE[i%arr.length] = -1;
        //     }
        //     else {
        //         NGE[i%arr.length] = arr[s.peek()];
        //     }
        //     s.push(i%arr.length);
        // }
    }

    public static void main(String args[]) {
        int arr[] = {6, 8, 0, 1, 3};
        int NGE[] = new int[arr.length];
        find_NGE(arr, NGE);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(NGE[i]+" ");
        }
    }
}