import java.util.*;
public class SpiralMatrix {

    public static void PrintSpiral(int array[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = array.length - 1;
        int endCol = array[0].length - 1;

        while(startRow <= endRow && startCol <= endCol) {
            //top
            for(int j = startCol; j <= endCol; j++) {
                System.out.print(array[startRow][j]+" ");
            }
            //Right
            for(int i = startRow+1; i <= endRow; i++) {
                System.out.print(array[i][endCol]+" ");
            }
            //Down
            for(int j = endCol-1; j >= startCol; j--) {
                System.out.print(array[endRow][j]+" ");
            }
            //Left
            for(int i = endRow-1; i >= startRow+1; i--) {
                System.out.print(array[i][startCol]+" ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int array[][] = {{1, 2, 3, 4},
                         {5, 6, 7, 8},
                         {9, 10, 11, 12},
                         {13, 14, 15, 16}};
        PrintSpiral(array);
    }
}