import java.util.*;
public class DiagonalSum {

    public static int Sum(int array[][]) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i][i];
            if(i != array.length-1-i)
                sum += array[i][array.length-i-1];
        }
        return sum;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int array[][] = {{1, 2, 3, 4},
                         {5, 6, 7, 8},
                         {9, 10, 11, 12},
                         {13, 14, 15, 16}};
        System.out.println("Sum of the diagonals : "+Sum(array));
    }
}