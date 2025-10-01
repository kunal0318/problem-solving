package com.problem.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	 public boolean containsDuplicate(int[] nums) {
	        Set<Integer> set = new HashSet<>();
	        for(int i=0; i<nums.length; i++){
	            set.add(nums[i]);
	            if(i+1 != set.size()) {
	            	return true;
	            }
	        }
	        return false;
	    }
}
