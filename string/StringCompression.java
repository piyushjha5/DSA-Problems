import java.util.*;
public class StringCompression {

    public static String Compress(String str) {
        StringBuilder newstr = new StringBuilder("");
        for(int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            newstr.append(str.charAt(i));
            if(count > 1) {
                newstr.append(count);
            }
        }
        return newstr.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = "aabbbss";
        System.out.println(Compress(str));
    }
}
