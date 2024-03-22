import java.util.*;
public class LargestInArray {
    
    public static int Largest(int array[]) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int array[] = {7, 4, 5, 20, 10};
        System.out.println("Largest in the array is "+Largest(array));
    }
}