import java.util.*;
public class Fibonacci {
    public static int printfibonacci(int n) {
        if(n == 0 || n == 1){
            return n;
        }
        int fibo = printfibonacci(n-1) + printfibonacci(n-2);
        return fibo;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 25;
        System.out.println(printfibonacci(n));
    }
}