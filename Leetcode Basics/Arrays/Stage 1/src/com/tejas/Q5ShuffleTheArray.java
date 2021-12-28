//https://leetcode.com/problems/shuffle-the-array/

//Changed class from solution to Q3RunningSumOf1DArray
package com.tejas;

    class Q5ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] x=new int[nums.length/2];
        int[] y= new int[nums.length/2];
        int[] ans= new int[nums.length];
        
        for(int i=0;i<x.length;i++){//put first half elements of nums array in array x
            x[i]=nums[i];
        }
        
        for(int i=0;i<y.length;i++){//put second half elements of nums array in array y
            y[i]=nums[(nums.length/2)+i];
        }
        
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0){
                ans[i]=x[i];//here array index out of bound comes because x max size is 3 but i goes to 5
                //this is happening to place values at even places and same goes with odd places.
                // solution to this is to go for odd even but not divide elements in x and y arrays...
                //check Q5Solution.java...
            }
            
            
        }
        
        
        return ans;
    }
}
}