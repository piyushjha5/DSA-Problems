//(Friends Pairing Problem)Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. Find out the number of ways in which friends can remain single or can be paired up.

import java.util.*;
public class FriendsPairingProblem {
    public static int pairs(int n) {
        if(n == 1 || n == 2) {
            return n;
        }

        //single
        int singlePair = pairs(n-1);

        //pairs
        int doublePair = (n-1) * pairs(n-2);

        return singlePair + doublePair;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(pairs(3));
    }
}