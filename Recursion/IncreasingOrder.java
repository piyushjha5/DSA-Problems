//Print numbers from n to 1 (Increasing Order)
import java.util.*;
public class IncreasingOrder {
    public static void printincreasing(int n) {
        if(n <= 0) {
            return;
        }
        printincreasing(n-1);
        System.out.print(n+" ");
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        printincreasing(n);
    }
}