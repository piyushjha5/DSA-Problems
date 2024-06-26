import java.util.*;
public class SumOfNno {
    public static int sum(int n) {
        if(n == 1) {
            return 1;
        }
        int result = n + sum(n-1);
        return result;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        System.out.print(sum(n));
    }
}