import java.util.*;
public class MaxSubArraySum {

    public static void maxsubarraysum(int array[]) {
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            for(int j = i; j < array.length; j++) {
                for(int k = i; k <= j; k++) {
                    sum = sum + array[k];
                }
                if(sum > maxsum)
                    maxsum = sum;
                sum = 0;
            }
        }
        System.out.println("Maximum sum in the sub array is : "+maxsum);
    }

    public static void prefixsum(int array[]) {
        int maxsum = Integer.MIN_VALUE;
        int sum = Integer.MIN_VALUE;
        int prefix[] = new int[array.length];
        prefix[0] = array[0];
        for(int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1 ] + array[i];
        }

        for(int i = 0; i < array.length; i++) {
            for(int j = i; j < array.length; j++) {
                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                if(sum > maxsum)
                    maxsum = sum;
            }
        }
        System.out.println("Maximum sum in the sub array is : "+maxsum);
    }

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
        int array[] = {1, -2, 6, -1, 3};
        maxsubarraysum(array);
        prefixsum(array);
        kadane(array);
    }
}