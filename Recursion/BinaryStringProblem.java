//Print all binary strings of size N without consecutive ones.(Binary String Problem)
import java.util.*;
public class BinaryStringProblem {
    public static void printBinaryStrings(int n, int lastPlace, String str) {
        if(n == 0){
            System.out.println(str);
            return;
        }
    
        printBinaryStrings(n-1, 0, str+"0");
        if(lastPlace == 0) {
            printBinaryStrings(n-1, 1, str+"1");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        printBinaryStrings(3, 0, "");
    }
}