import java.util.*;
public class Operations {

    // Get Ith Bit
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if((n & bitMask) == 0)
            return 0;
        else
            return 1;
    }

    // Set Ith Bit
    public static int setIthBit(int n, int i) {
        // i is the index that will be changed
        int bitMask = 1 << i;
        return n | bitMask;
    }

    // Clear Ith Bit
    public static int clearIthBit(int n, int i) {
        // i is the index that will be cleared
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println(getIthBit(10, 0));

        System.out.println(setIthBit(10, 3));

        System.out.println(clearIthBit(10, 1));
    }
}