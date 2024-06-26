// print x^n
import java.util.*;
public class Xpower {
    public static int printPower(int x, int n) {
        if(n == 0)
            return 1;
        int result = x * printPower(x, n-1);
        return result;
    }
    public static int optimized(int x, int n) {
        if(n == 0)
            return 1;

        int result = 1;
        int halfPower = optimized(x, n/2);
        if((n%2) == 0) 
            result = halfPower * halfPower;
        
        if((n%2) != 0) 
            result = x * halfPower * halfPower;

        return result;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = 2;
        int n = 5;
        System.out.println(optimized(x, n));
    }
}