
// Fint out minimum and maximum of an array
import java.util.*;

public class Q1 {

    public static void GetMax(int arry[]) {
        int max = arry[0];
        for (int i = 1; i < arry.length; i++) {
            if (arry[i] > max) {
                max = arry[i];
            }
        }
        System.out.println("Maximum value in array is : " + max);
    }

    public static void GetMin(int arry[]) {
        int min = arry[0];
        for (int i = 1; i < arry.length; i++) {
            if (arry[i] < min) {
                min = arry[i];
            }
        }
        System.out.println("Manimum value in array is : " + min);
    }

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the arrray : ");
        int size = input.nextInt();
        int arry[] = new int[size];

        for (int i = 0; i < size; i++) {
            arry[i] = input.nextInt();
        }

        GetMax(arry);
        GetMin(arry);
    }
}