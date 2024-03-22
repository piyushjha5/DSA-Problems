import java.util.*;
public class PrintSubArrays {

    public static void subarrays(int array[]) {
        for(int i = 0; i < array.length; i++) {
            for(int j = i; j < array.length; j++) {
                for(int k = i; k <= j; k++) {
                    System.out.print(array[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int array[] = {1, 2, 3, 4, 5};
        subarrays(array);
    }
}