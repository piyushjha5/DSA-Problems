/* Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can 
trap after raining */

import java.util.*;
public class TrappingRainWater {

    public static int trappedwater(int height[]) {
        int n = height.length;

        //Calculate left max boundary - auxillary array
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i] , leftmax[i-1]);
        }

        //Calcuate right max boundary - auxillary array
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i] , rightmax[i+1]);
        }

        int trappedWater = 0;
        for(int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trappedWater = trappedWater + (waterlevel - height[i]);
        }
        return trappedWater;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedwater(height));
    }
}