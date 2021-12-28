//https://leetcode.com/problems/build-array-from-permutation/
package com.tejas;

import java.util.Scanner;
class Q1BuildArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int[] nums= new int[6];
        int[] ans= nex int[6];
        Scanner sc= new Scanner(System.in);
        
        for(int i=0;i<6;i++)
        {
            nums[i]=sc.nextInt();//Runtime error: java.util.NoSuchElementException
        }
        
        for(int i=0;i<6;i++)
        {
            nums[i]=nums[nums[i]];
            ans[i]=nums[i];
        }
        
        return ans;
    }
}
