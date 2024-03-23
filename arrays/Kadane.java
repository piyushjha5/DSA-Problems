import java.util.*;
public class Kadane {

    public static void kadane(int array[]) {
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            if(sum < 0)
                sum = 0;
            maxsum = Math.max(sum, maxsum);
        }
        System.out.println("Out max subarray sum is : "+maxsum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int array[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadane(array);
    }
}