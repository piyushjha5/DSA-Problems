import java.util.*;
public class PalindromeString {

    public static void check(String str) {
        for(int i = 0; i <= str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-i-1)) {
                System.out.println("String is not Palindrome");
                return;
            }
        }
        System.out.println("String is Palindrome");
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to check it is palindrome or not : ");
        String str = sc.nextLine();
        check(str);
    }
}