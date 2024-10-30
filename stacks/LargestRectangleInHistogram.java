// Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.

import java.util.*;
public class LargestRectangleInHistogram {

    static int findArea(int heights[]) {
        int NSE[] = new int[heights.length];
        int PSE[] = new int[heights.length];

        Stack<Integer> s = new Stack<>();
        for(int i = heights.length-1; i >= 0; i--) {
            while (!s.empty() && heights[i] <= heights[s.peek()]) {
                s.pop();
            }
            if(s.empty()) {
                NSE[i] = heights.length;
            }
            else {
                NSE[i] = s.peek();
            }
            s.push(i);
        }
        s.clear();
        for(int i = 0; i < heights.length; i++) {
            while (!s.empty() && heights[i] <= heights[s.peek()]) {
                s.pop();
            }
            if(s.empty()) {
                PSE[i] = -1;
            }
            else {
                PSE[i] = s.peek();
            }
            s.push(i);
        }
        int area = Integer.MIN_VALUE;
        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < heights.length; i++) {
            int width = NSE[i] - PSE[i] - 1;
            area = heights[i] * width;
            if (area > maxArea) {
                maxArea = area;
            }
        }
        return maxArea;
    }

    public static void main(String args[]) {
        int heights[] = {2, 1, 5, 6, 2, 3};
        System.out.println(findArea(heights));
    }
}