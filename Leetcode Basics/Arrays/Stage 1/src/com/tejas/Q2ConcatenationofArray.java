//https://leetcode.com/problems/concatenation-of-array/

//First attempt logic accepted changing class from solution to Q2ConcatenationofArray

//Accepted for given inputs but got error for other test case. Proper understanding missing of what went
// wrong. POssible solution conclusion(submitted one and no runtime error) states that simplify logics
// like i take two for loop that making index out of bound for other test cases. Suggested solution use one 
// for loop
package com.tejas;

class Q2ConcatenationofArray {
    public int[] getConcatenation(int[] nums) { 
        int[] ans=new int[2*(nums.length)];//doubled ans array length w.r.t nums array to repeat 
        //nums values in ans array
        int n=0;// n variable notes how much ans array is filled with nums value in first time.
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];// filled ans variable exactly like nums array for starting values
            n=n+i;
        }
        
        for(int i=0;i<(ans.length)/2;i++){//(ans.length)/2 is because ans array is half filled 
            //already with nums.length in above for loop. Without /2 we get index out of bound error
            ans[n+i]=nums[i];//with n now filling ans array againn for 2nd time nums values...
        }
        return ans;
            
    }
}