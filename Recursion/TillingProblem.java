//Given a "2 * n" board and tiles of size "2 * 1", count the number of ways to tile the given board using the 2 * 1 tiles. (A tile can either be place horizontally or vertically.)
import java.util.*;
public class TillingProblem {
    public static int ways(int n) {
        if(n == 0 || n == 1)
            return 1;
        //vertical choice
        int fnm1 = ways(n-1);
        //horizontal choice
        int fnm2 = ways(n-2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        System.out.println(ways(n));
    }
}