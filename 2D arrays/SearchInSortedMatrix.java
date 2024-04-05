import java.util.*;
public class SearchInSortedMatrix {

    public static void Search(int matrix[][], int key) {
        int row = 0, col = matrix[0].length-1;
        while(row < matrix.length && col >= 0) {
            if(key == matrix[row][col]) {
                System.out.println("Key found at index ("+row+" "+col+")");
                return;
            }
            else if(key < matrix[row][col]) {
                col--;
            }
            else {
                row++;
            }
        }
        System.out.println("Key not found");
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = {{10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {27, 29, 37, 48},
                          {32, 33, 39, 50}};
        int key = 333;
        Search(matrix, key);
    }
}