import java.util.*;
public class OddEven {
    public static void Check(int n) {
        int bit = 1;
        if((n & bit) == 1)
            System.out.println("No. is Odd");
        else
        System.out.println("No. is Even");
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Check(200);
    }
}