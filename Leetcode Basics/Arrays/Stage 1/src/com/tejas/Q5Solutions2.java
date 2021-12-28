//https://leetcode.com/problems/shuffle-the-array/
//from jatin's logic extending the concept of x and y short arrays that i made from nums array.
class Q5Solution2 {
    public int[] shuffle(int[] nums, int n) {
        int[] x=new int[nums.length/2];
        int[] y= new int[nums.length/2];
        int[] ans= new int[nums.length];
        
        for(int i=0;i<x.length;i++){
            x[i]=nums[i];
            y[i]=nums[(nums.length/2)+i];// made one for loop for both x and y arrays values

        }
        
        for(int i=0;i<nums.length/2;i++)// here i stuck because ans array can take 6 values and x and 
        //y can take only 3 values so i<nums.length gives out of index error saying that x[i] and y[i]
        //can go only 0 to 2 but i is going to 0 to 5 in i<nums.length case.
        {
            // if(i%2==0){
                ans[i*2]=x[i];//we solved this problem by changing i<nums.length/2 and ans array's 
                //i multiplied by 2 and (i*2)+1 to get values from x and y arrays at alternate indexes.
                ans[(i*2)+1]=y[i];
            // }
            
            
        }
        
        
        return ans;
    }
}



