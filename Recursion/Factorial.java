import java.util.*;
public class Factorial {
    public static int fact(int n) {
        if(n == 0){
            return 1;
        }
        int result = n * fact(n-1);
        return result;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        System.out.print(fact(n));
    }
}