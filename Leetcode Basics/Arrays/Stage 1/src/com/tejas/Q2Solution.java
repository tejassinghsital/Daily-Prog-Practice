//https://leetcode.com/problems/concatenation-of-array/

class Q2Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans=new int[2*(nums.length)];
       // int n=0;
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            //n=n+i;
            ans[nums.length+i]=nums[i];
        }
        
        // for(int i=0;i<((ans.length)/2);i++){
        //     ans[n+i]=nums[i];
        // }
        return ans;
            
    }
}


