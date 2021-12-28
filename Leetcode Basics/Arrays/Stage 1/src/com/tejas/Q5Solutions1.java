//https://leetcode.com/problems/shuffle-the-array/
//from discussion section
class Q5Solution1 {
    public int[] shuffle(int[] nums, int n) {
        int[] ans= new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0){//this is for odd
                ans[i]=nums[i/2];// /2 because we can use half valuse as x(remeber for array x 
                //i am doing nums.length/2 that's same) 
            }
            else{
                ans[i]=nums[n+i/2];
            }
            
        }
        
        
        return ans;
    }
}


