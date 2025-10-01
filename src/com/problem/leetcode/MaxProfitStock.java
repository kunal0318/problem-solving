package com.problem.leetcode;

public class MaxProfitStock {

	class Solution {
	    public int maxProfit(int[] prices) {
	        int tempBuy = Integer.MAX_VALUE;
	        int maxProfit = 0;

	        for(int i=0; i<prices.length; i++){
	            if(prices[i]< tempBuy){
	                tempBuy = prices[i];
	            }
	            if((prices[i] - tempBuy) > maxProfit){
	                maxProfit = prices[i] - tempBuy;
	            }
	        }
	        return maxProfit;
	    }
	}
}
