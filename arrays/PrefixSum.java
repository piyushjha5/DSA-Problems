import java.util.*;
public class PrefixSum {

    public static void prefixsum(int array[]) {
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[array.length];
        prefix[0] = array[0];
        for(int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1 ] + array[i]; 

            if(maxsum < prefix[i])
                maxsum = prefix[i];
        }
        System.out.println("Maximum sum in the sub array by prefix sum is : "+maxsum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int array[] = {1, -2, 6, -1, 3};
        prefixsum(array);
    }
}