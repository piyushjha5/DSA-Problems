import java.util.*;
public class PairSum2 {

    public static boolean findSolution(ArrayList<Integer> num, int target) {
        int pivotIndex = -1; //pivot element is the breaking point of rotating array.
        for(int i = 0; i < num.size()-1; i++) {
            if(num.get(i) > num.get(i+1)) {
                pivotIndex = i;
            }
        }
        int lp = pivotIndex+1;
        int rp = pivotIndex;
        while(lp != rp) {
            if(num.get(lp) + num.get(rp) == target) {
                return true;
            }
            else if(num.get(lp) + num.get(rp) > target) {
                rp = (rp+num.size()-1)%num.size();
            }
            else{
                lp = (lp+1)%num.size();
            }
        }

        return false;
    }

    public static void main(String args[]) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(11);
        num.add(15);
        num.add(6);
        num.add(8);
        num.add(9);
        num.add(10);

        System.out.println(findSolution(num, 155));
    }
}