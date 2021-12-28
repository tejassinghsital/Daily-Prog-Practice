//https://leetcode.com/problems/running-sum-of-1d-array/

//Changed class from solution to Q3RunningSumOf1DArray
package com.tejas;

    class Q3RunningSumOf1DArray {
    public int[] runningSum(int[] nums) {
        int[] ans=new int[nums.length];
        ans[0]=nums[0];//fixed first value of array w.r.t nums
        for(int i=1;i<nums.length;i++){   
            ans[i]= ans[i-1]+nums[i];//first fixed value + next value
        }
        return ans;
    }
}