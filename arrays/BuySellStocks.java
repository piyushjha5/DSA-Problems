/* You are given an array prices where prices[i] is the price of a given stock on the ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0. */

import java.util.*;
public class BuySellStocks {

    public static int getmaxprofit(int prices[]) {
        int maxprofit = 0;
        int buyprize = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++) {
            if(buyprize < prices[i]) {
                int profit = prices[i] - buyprize;
                maxprofit = Math.max(profit, maxprofit);
            }
            else {
                buyprize = prices[i];
            }
        }
        return maxprofit;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(getmaxprofit(prices));
    }
}