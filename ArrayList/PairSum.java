import java.util.*;
public class PairSum {

    public static boolean findSolution(ArrayList<Integer> num, int target) {
        int lp = 0;
        int rp = num.size() - 1;

        for(int i = 0; i < num.size(); i++) {
            if(num.get(lp) + num.get(rp) == target) {
                return true;
            }
            else if(num.get(lp) + num.get(rp) > target) {
                rp--;
            }
            else {
                lp++;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);

        System.out.println(findSolution(num, 18));
    }
}